with .arg1 type.adr do 2;
with .arg2,.arg3 type.pair.credent do 3-5;
core-connect .arg1
set this.c = (tocredent .arg2,.arg3;);
core-auth this.c fail 6,7;
core-connect !back;
console-print "Authentication Failed";