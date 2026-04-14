package JavaCollection;

class Buffer {
    public static void main(String[] args) {
        int size=3;
        int[] arr = new int[size];
        int index=0;

        int[] input={1,2,3,4};

        for(int x:input){
            arr[index]=x;
            index=(index+1)%size;
        }

        for(int x:arr)
            System.out.print(x+" ");
    }
}