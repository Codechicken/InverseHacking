package codechicken.ih.dev;

import java.io.File;
import java.util.*;

class CompileState {
	LinkedList<File> compileBuffer = new LinkedList<>();
	TreeMap<String,CompileRecord> state = new TreeMap<>();
	TreeMap<String,CompileRecord> core = new TreeMap<>();
	CompileState pushBackFile(File pb) {
		System.out.println("Pushed back " + pb.toString());
		compileBuffer.add(pb);
		return this;
	}
	CompileState init(File core){
		return this;
	}
	boolean isgetBuffer(){
		return !compileBuffer.isEmpty();
	}
	File getBuffer(){
		return compileBuffer.pop();
	}
}
