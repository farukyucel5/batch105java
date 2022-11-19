package ders40_interface;

public interface Interface_child_of_interface extends Interface1{
    //eğer interface'i baska bir interface e child yapmak için extends kullanılır.
    //bir interface concrete class'ı inherit edemez.
    void method1();

    //Interface bir child parent Interface'deki abstract merhod'u override edebilir
    //Ama ikisininde body'si olmadığından bu işlemin bir anlamı yoktur.
}
