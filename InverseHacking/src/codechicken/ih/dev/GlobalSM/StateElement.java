package codechicken.ih.dev.GlobalSM;

public class StateElement {
Class<?> type;
Object el;
	@SuppressWarnings("unchecked") //should be correct and never fail
	public <T> T get(){
	if (type == null){
		throw (ClassCastException) new ClassCastException().initCause(new NullPointerException());
	}
		return (T) type.cast(el);
	
}
	@SuppressWarnings("unchecked") // should be correct if cast is valid
	<T> T get(Class<?> type) throws ClassCastException {
		return (T) type.cast(el);
		
	}
public <T> void put(T element){
	type= element.getClass();
	el=element;
}
}
