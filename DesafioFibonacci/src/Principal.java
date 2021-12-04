

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

            // [ A ] declarando e instanciando um array
            List<Integer> array = new ArrayList<>();

            // [ B ] usando o metodo add() para gravar 2 elementos do array
            array.add(0, 0);
            array.add(1, 1);
            int i = 2;
            int elementActual = 0;

            // [ C ] get(int index): Retornando o i-ésimo elemento da lista
            while (elementActual < 350) {
                elementActual = (array.get(i - 2) + array.get(i - 1));
                array.add(i, elementActual);
                ++i;
            }

            // [ D ] imprimindo o array

            System.out.println(array);

        }

    }

