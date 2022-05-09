<?php

abstract class czlowiek
{
    protected $imie;
    protected $nazwisko;
    protected function putData($imie, $nazwisko)
    {
        $this->imie =  $imie;
        $this->nazwisko = $nazwisko;
    }
}

class student extends czlowiek
{
    private $indeks;
    private $grupa;
    public function __construct($imie, $nazwisko, $indeks, $grupa)
    {
        $this->imie = $imie;
        $this->nazwisko = $nazwisko;
        $this->indeks = $indeks;
        $this->grupa = $grupa;        
    }
    public function displayData()
    {
        echo "<h3> Dane Studenta </h3>";
        echo "imie: $this-> imie<br/>";
        echo "nazwisko: $this-> nazwisko<br/>";
        echo "indeks: $this-> indeks<br/>";
        echo "grupa: $this-> grupa<br/>";
    }
}

class profesor extends czlowiek
{
    private $katedra;
    public function __construct($imie, $nazwisko, $katedra)
    {
        $this->imie = $imie;
        $this->nazwisko = $nazwisko;
        $this->katedra = $katedra;
    }
    public function displayData()
    {
        echo "<h3> Dane Profesora </h3>";
        echo "imie: $this-> imie<br/>";
        echo "nazwisko: $this-> nazwisko<br/>";
        echo "katedra: $this-> katedra<br/>";
    }
}

$student = new student('Jan', 'Kowalski', '350', 'A01');
$student->displayData();
$profesor = new profesor('Stefan', 'Nowak', 'Informatyka Stosowana');
$profesor->displayData();

