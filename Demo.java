class gp {
int a;
gp() { System.out.println("GP-Default"); }
gp(int x) { System.out.println("GP-Parameterised"); }
}
class parent extends gp {
parent() { System.out.println("Parent-Default"); }
parent(int x) { System.out.println("Parent-Parameterised"); }
}
class Demo {
public static void main(String ar[]) {
gp g1 = new gp(5);
parent p1 = new parent(10); }
}
