with .arg1 type.dir do 2,3;
set this.lst0 = .arg1.content;
for-each this.lst0 this.file 4;
console-print this.file.name;
terminate;