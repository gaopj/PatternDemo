package gpj.myProxy;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

public class Proxy {

	public static Object newProxyInstance(Class<?> myInterface,InvocationHandler handler) throws Exception{
		String rt = "\r\n";
		String methodStr = "";
		for (Method m : myInterface.getMethods()) {
			methodStr +="	@Override"+rt+
			"	public void "+m.getName()+"() {"+rt+
			"try{"+rt+
			" Method md ="+myInterface.getName()+".class.getMethod(\""+m.getName()+"\");"+rt+
			" h.invoke(this,);"+rt+
			"}catch(Exception e){e.printStackTrace();}"+rt+
			"	}";
		}
		String str=
		"package gpj.myProxy;"+rt+
		"import gpj.myProxy.InvocationHandler;"+rt+
		"import java.lang.reflect.Method;"+rt+
		"public class $Proxy0 implements "+myInterface.getName()+ "{"+rt+
		"	public $Proxy0(InvocationHandler h) {"+rt+
		"		super();"+rt+
		"		this.h = h;"+rt+
		"	}"+rt+
		"   private InvocationHandler h;"+rt+
		methodStr+rt+
		"}"+rt;
		
		//�����������java�ļ�
		String filename = System.getProperty("user.dir")+"/bin/gpj/myProxy/$Proxy0.java";
		System.out.println(filename);
		
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str);
		
		//����
		//�õ�������
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//�ļ�������
		StandardJavaFileManager fileManager 
				= compiler.getStandardFileManager(null, null, null);
		
		//��ȡ�ļ�
		Iterable units= fileManager.getJavaFileObjects(filename);
		
		//��������
		//compiler.getTask(out, fileManager, diagnosticListener, options, classes, compilationUnits)
		 CompilationTask t=compiler.getTask(null, fileManager, null, null, null, units);
		 
		 //���б���
		 t.call();
		 fileManager.close();
		 
		 //���ص��ڴ�
		 ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		 Class class1 = classLoader.loadClass("gpj.proxy.$Proxy0");
		 
		 Constructor constructor = class1.getConstructor(InvocationHandler.class);
		 
		 return constructor.newInstance(handler);
	}
}
