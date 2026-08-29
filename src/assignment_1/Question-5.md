
-----------Method with void return type-------------

A method declared using the keyword void in its signature indicates that it does not return any value to the user.

void greet() {
    System.out.println("Hello, welcome!");
}

---------Method with a return value (non-void)--------
A method declared with a specific data type (such as int, float, String, boolean, etc.) as its return type must be the (datatype) a value of that type back to the user using the return statement

int add(int a, int b) {
    return a + b;
}