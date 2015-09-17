package codechicken.ih.dev;
import java.io.File;
import java.util.LinkedList;
public class AssetCompiler {
static public void main(String[] args){
	if (args.length==0) {
		System.out.println("Not enough arguments\nUsage: AssetCompiler files to compile");
	System.exit(0);
	}
	LinkedList<File> toCompile = new LinkedList<>();
	// BEGIN: Iterate filesystem
	for(int i=0;i<args.length;i++){
		toCompile.add(new File(args[i]));
	}
	for (int i=0;i<toCompile.size();i++){
		File tmp = toCompile.get(i);
		if(tmp.isDirectory()){
			File[] toAdd = tmp.listFiles();
			for (int j=0;j<toAdd.length;j++){
				toCompile.add(toAdd[j]);
			}
		}
	}
	//END: Iterate filesystem
	System.out.println("Compiling: "+toCompile);
	// do the compile
	Compiler cmp = new Compiler();
	CompileState state = new CompileState();
	boolean islast=false;
	for (int i=0;i<toCompile.size();i++){
		if(i==toCompile.size()-1){
			islast=true;
		}
		cmp.compile(state,toCompile.get(i) ,islast);
	}
	
};
}
