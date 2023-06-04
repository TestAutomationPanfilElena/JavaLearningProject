package org.panfil.exceptionsservicetask;

public class ArithmeticOperationService {
    public class ArithmeticOperationsService {
        public static int divideIntNoExceptionHandling(int a, int b) {
            return a / b;

        }

        public static int divideIntWithExceptionHandling(int a, int b) {
            try {
                int result = a / b;
                return result;
            } catch (Exception capturedExeption) {
                System.out.println("An exeption has occured: " + capturedExeption.getMessage());
                return 0;
            }

        }
        }
        }
