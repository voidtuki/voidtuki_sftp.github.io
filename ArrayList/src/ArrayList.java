import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList {
    private static final int DEFAULT_CAPACITY=10;

    private int[] arrayList;

    //默认无参构造器，容量为10
//    public ArrayList() {
//        arrayList = new int[DEFAULT_CAPACITY];
//    }

    //用户自定义容量无参构造器


    public ArrayList(int capacity) {
        if (capacity < 0)
        {
            capacity = DEFAULT_CAPACITY;//不符合为默认容量值
        }
        arrayList = new int[capacity];
    }


    //1,add
    public int size;
    public void add(int ele)
    {

        //判断是否扩容
        if (size >= arrayList.length)
            grow();
        arrayList[size++] = ele;
    }

    //2.remove
    public void remove(int index)
    {
        for (int i=index;i<size;i++)
        {
            if (i!= size-1)
                arrayList[i] = arrayList[i+1];
            else
                size--;

        }
    }

    //3.get
    public void set(int index,int newValue)
    {
        arrayList[index] = newValue;
    }

    //4.get
    public void get(int index)
    {
        System.out.println(arrayList[index]);
    }

    //5.insert
    public void insert(int index,int value)
    {
        size++;
        //先移位
        for (int i = size-1;i>index;i--)
        {
            arrayList[i] = arrayList[i-1];
        }
        //后赋值
        arrayList[index] = value;


    }

    //6.grow
    public void grow()
    {
        int oldCapacity = arrayList.length;
        int newCapacity = oldCapacity * 2;
        //方法1
        arrayList = Arrays.copyOf(arrayList,newCapacity);

        //方法2
//        wrapList(newCapacity);

    }

    //扩容交换列表
    public void wrapList(int newCapacity)
    {
        int[] newList = new int[newCapacity];

        for (int i=0;i<size;i++)
        {
            newList[i] = arrayList[i];
        }

        arrayList = new int[newCapacity];

        for (int i=0;i<size;i++)
        {
           arrayList[i] = newList[i];
        }
    }



    public void read()
    {
        for (int i = 0;i<size;i++)
            System.out.println(arrayList[i]);
    }

}

