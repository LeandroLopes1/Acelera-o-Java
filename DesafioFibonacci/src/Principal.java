

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

            List<Integer> array = new ArrayList<>();
            array.add(0, 0);
            array.add(1, 1);
            int i = 2;
            int elementActual = 0;
            while (elementActual < 13) {
                elementActual = (array.get(i - 2) + array.get(i - 1));
                array.add(i, elementActual);
                ++i;
            }
            System.out.println(array);

        }

    }

