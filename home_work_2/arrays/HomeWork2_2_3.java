package arrays;

import utils.ArraysUtils;

interface IArraysOperation {
        int [] container = ArraysUtils.arrayFromConsole();

        void outputAllElements(int[] a);

        void outputDifferentElements(int[] a);

        void outputReversAllElements(int[] a);
    }

    class DoWhileOperation implements IArraysOperation {
        public void outputAllElements(int[] a) {
            int i = 0;
            do {
                int element = a[i];
                System.out.print(element + "\t");
                i++;
            } while (i < a.length);
            System.out.println();
        }

        public void outputDifferentElements(int[] a) {
            int i = 1;
            do {
                int element = a[i];
                System.out.print(element + "\t");
                i += 2;
            } while (i < a.length);
            System.out.println();
        }

        public void outputReversAllElements(int[] a) {
            int i = a.length - 1;
            do {
                int element = a[i];
                System.out.print(element + "\t");
                i--;
            } while (i >= 0);
            System.out.println("\n");
        }
    }

    class WhileOperation implements IArraysOperation {
        public void outputAllElements(int[] a) {
            int k = 0;
            while(k < a.length){
                int element = a[k];
                System.out.print(element + "\t");
                k++;
            }
            System.out.println();
        }

        public void outputDifferentElements(int[] a) {
            int k = 1;
            while (k < a.length) {
                int element = a[k];
                System.out.print(element + "\t");
                k += 2;
            }
            System.out.println();
        }

        public void outputReversAllElements(int[] a) {
            int k = a.length - 1;
            while(k >= 0){
                int element = a[k];
                System.out.print(element + "\t");
                k--;
            }
            System.out.println("\n");
        }
    }

    class ForOperation implements IArraysOperation {
        public void outputAllElements(int[] a){
            for (int j = 0; j < a.length; j++) {
                int element = a[j];
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        public void outputDifferentElements(int[] a){
            for (int j = 1; j < a.length; j += 2) {
                int element = a[j];
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        public void outputReversAllElements(int[] a) {
            for (int j = a.length - 1; j >= 0; j--) {
                int element = a[j];
                System.out.print(element + "\t");
            }
            System.out.println("\n");
        }
    }

    class ForEachOperation implements IArraysOperation {
        public void outputAllElements(int[] a) {
            for (int y : a) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }

        public void outputDifferentElements(int[] a) {
            int g = 1;
            for (int y : a) {
                if (y == a[g]) {
                    System.out.print(y + "\t");
                    if (g < a.length - 2) {
                        g += 2;
                    }
                }
            }
            System.out.println();
        }

        public void outputReversAllElements(int[] a) {
            int g = a.length - 1;
            int[] temp = new int[a.length];
            for (int y : a) {
                temp[g] = y;
                g--;
            }
            for (int z : temp) {
                System.out.print(z + "\t");
            }
            System.out.println("\n");
        }
    }

    class HomeWork2_2_3 {
        public static void main(String[] args) {
            IArraysOperation A;
            DoWhileOperation obj1 = new DoWhileOperation();
            A = obj1;
            A.outputAllElements(IArraysOperation.container);
            A.outputDifferentElements(IArraysOperation.container);
            A.outputReversAllElements(IArraysOperation.container);

            WhileOperation obj2 = new WhileOperation();
            A = obj2;
            A.outputAllElements(IArraysOperation.container);;
            A.outputDifferentElements(IArraysOperation.container);
            A.outputReversAllElements(IArraysOperation.container);

            ForOperation obj3 = new ForOperation();
            A = obj3;
            A.outputAllElements(IArraysOperation.container);
            A.outputDifferentElements(IArraysOperation.container);
            A.outputReversAllElements(IArraysOperation.container);

            ForEachOperation obj4 = new ForEachOperation();
            A = obj4;
            A.outputAllElements(IArraysOperation.container);
            A.outputDifferentElements(IArraysOperation.container);
            A.outputReversAllElements(IArraysOperation.container);
        }
    }
