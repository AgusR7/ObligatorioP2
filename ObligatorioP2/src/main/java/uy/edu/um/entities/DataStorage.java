package uy.edu.um.entities;

import uy.edu.um.tads.linkedlist.MyLinkedListImpl;
import uy.edu.um.tads.linkedlist.MyList;
import uy.edu.um.tads.linkedlist.Node;

import java.time.LocalDate;

public class DataStorage {
    private MyList<EntradaTop50> entradas;

    public DataStorage() {
        this.entradas = new MyLinkedListImpl<>();
    }

    public void agregarEntrada(EntradaTop50 entrada) {
        entradas.add(entrada);
    }

    public void agregarEntradas(MyList<EntradaTop50> nuevasEntradas) {
        Node<EntradaTop50> actual = nuevasEntradas.getFirst();
        while (actual != null) {
            entradas.add(actual.getValue());
            actual = actual.getNext();
        }
    }

    public MyList<EntradaTop50> getTop10Songs(String pais, LocalDate fecha) {
        MyList<EntradaTop50> top10 = new MyLinkedListImpl<>();
        MyList<EntradaTop50> entradasPaisyFecha = new MyLinkedListImpl<>();
        Node<EntradaTop50> actual = entradas.getFirst();
        while (actual != null) {
            EntradaTop50 entry = actual.getValue();
            if (entry.getPais().equals(pais) && entry.getFecha().equals(fecha)) {
                entradasPaisyFecha.add(entry);
            }
            actual = actual.getNext();
        }
        actual = entradasPaisyFecha.getFirst();
        int count = 0;
        while (actual != null && count < 10) {
            top10.add(actual.getValue());
            actual = actual.getNext();
            count++;
        }
        return top10;
    }

    public MyList<EntradaTop50> getEntradasPorFecha(LocalDate fecha) {
        MyList<EntradaTop50> entradasPorFecha = new MyLinkedListImpl<>();
        Node<EntradaTop50> actual = entradas.getFirst();
        while (actual != null) {
            EntradaTop50 entry = actual.getValue();
            if (entry.getFecha().equals(fecha)) {
                entradasPorFecha.add(entry);
            }
            actual = actual.getNext();
        }
        return entradasPorFecha;
    }

    public MyList<EntradaTop50> getEntradasPorRangoDeFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        MyList<EntradaTop50> entradasPorRangoDeFechas = new MyLinkedListImpl<>();
        Node<EntradaTop50> actual = entradas.getFirst();
        while (actual != null) {
            EntradaTop50 entry = actual.getValue();
            if (!entry.getFecha().isBefore(fechaInicio) && !entry.getFecha().isAfter(fechaFin)) {
                entradasPorRangoDeFechas.add(entry);
            }
            actual = actual.getNext();
        }
        return entradasPorRangoDeFechas;
    }
}
