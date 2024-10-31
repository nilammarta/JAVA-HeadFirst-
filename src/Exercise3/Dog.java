package Exercise3;

class Dog {
    String name;

    public void bark(){
        System.out.println(name + " says Ruff!");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // membuat array dog
        Dog[] myDogs = new Dog[3];

//        menambahkan nilai pada array dog
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

//        menambahakna nama pada array 0 dan 1
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // menampilkan nama dari dog 2
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        // melakukan perulangan untuk menampilkan semua dog bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x +1;
        }

    }
}
