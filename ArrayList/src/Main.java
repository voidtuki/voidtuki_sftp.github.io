public class Main {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(-1);

        //1.
        for (int i = 0;i < 20;i++)
        {
            arrayList.add(i);
        }

        //2.
        arrayList.remove(0);


        //3.
        arrayList.set(1,2);

        //4.
        arrayList.get(2);

        //5.
        arrayList.insert(19,20);

        //read
        arrayList.read();
    }
}