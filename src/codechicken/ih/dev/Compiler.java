package codechicken.ih.dev;

import java.io.*;
import codechicken.ih.dev.GlobalSM.*;
import codechicken.ih.dev.CompilerSM.*;
public class Compiler {
	boolean hasCorePak;
public CompileState compile(CompileState state,File CompileMe,boolean lastFile){
	if(CompileMe.toString().contains("core.pak")){
		hasCorePak=true;
		state=state.init(CompileMe);
	}
	if(!hasCorePak&lastFile){
		throw new CompileError("Could not find 'core.pak'");
	}
	if(CompileMe.isDirectory()){
		return state;
	}
	if (!hasCorePak){
		state=state.pushBackFile(CompileMe);
	}
	
	return state;
	
}
}
