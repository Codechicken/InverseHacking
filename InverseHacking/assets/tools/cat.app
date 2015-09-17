if .arg1 type.file do 2,3 :else 4,continue;
	console-print arg1.content;
terminate;
	console-die "expected file";
terminate;