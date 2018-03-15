package GasLaws;


public class Equations {

    public static GasLaws G = new GasLaws();

    public static void v() {

    }

    public static void p() {

    }

    public static void n() {

    }

    public static void t() {

    }

    public static void checker() {
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                if (G.volumeTextField1.getText().trim().length() == 0) {

                } else if (G.volumeTextField1.getText().trim().length() > 0) {
                    G.volumedouble1 = Double.parseDouble(G.volumeTextField1.getText().trim());
                    G.volumedouble1 = Double.parseDouble(G.volumeTextField1.getText().trim());
                }
            } else if (i == 1) {
                if (G.pressureTextField1.getText().trim().length() == 0) {

                } else if (G.pressureTextField1.getText().trim().length() > 0) {
                    G.pressuredouble1 = Double.parseDouble(G.volumeTextField1.getText().trim());
                }
            } else if (i == 2) {
                if (G.molesTextField1.getText().trim().length() == 0) {

                } else if (G.molesTextField1.getText().trim().length() > 0) {
                    G.molesdouble1 = Double.parseDouble(G.volumeTextField1.getText().trim());
                }
            } else if (i == 3) {
                if (G.tempTextField1.getText().trim().length() == 0) {

                } else if (G.tempTextField1.getText().trim().length() > 0) {
                    G.tempdouble1 = Double.parseDouble(G.volumeTextField1.getText().trim());
                }
            } else if (i == 4) {
                if (G.volumeTextField2.getText().trim().length() == 0) {

                } else if (G.volumeTextField2.getText().trim().length() > 0) {
                    G.volumedouble2 = Double.parseDouble(G.volumeTextField2.getText().trim());
                }
            } else if (i == 5) {
                if (G.pressureTextField2.getText().trim().length() == 0) {

                } else if (G.pressureTextField2.getText().trim().length() > 0) {
                    G.pressuredouble2 = Double.parseDouble(G.pressureTextField2.getText().trim());
                }
            } else if (i == 6) {
                if (G.molesTextField2.getText().trim().length() == 0) {

                } else if (G.molesTextField2.getText().trim().length() > 0) {
                    G.molesdouble2 = Double.parseDouble(G.volumeTextField1.getText().trim());
                }
            } else if (i == 7) {
                if (G.tempTextField2.getText().trim().length() == 0) {

                } else if (G.tempTextField2.getText().trim().length() > 0) {
                    G.tempdouble2 = Double.parseDouble(G.volumeTextField1.getText().trim());
                }
            } else {

            }
        }
    }

    //Solves for volume
    public static void pv() {

        checker();

        G.step = G.pressuredouble2 * G.volumedouble2;
        G.answer = G.step / G.pressuredouble1;

        System.out.println(G.answer);

    }

    //Solves for pressure
    public static void pv2() {

        checker();

        G.step = G.pressuredouble2 * G.volumedouble2;
        G.answer = G.step / G.volumedouble1;

        System.out.println(G.answer);
    }

    //Solves for volume
    public static void vt() {

        checker();

        G.step = G.volumedouble2 * G.tempdouble1;
        G.answer = G.step / G.tempdouble2;

        System.out.println(G.answer);
    }

    //Solves for temperature
    public static void vt2() {

        checker();

        G.step = G.tempdouble2 * G.volumedouble1;
        G.answer = G.step / G.volumedouble2;

    }

    //Solves for pressure
    public static void pt() {

        checker();

        G.step = G.pressuredouble2 * G.tempdouble1;
        G.answer = G.step / G.tempdouble2;

    }

    //Solves for temperature
    public static void pt2() {

        checker();

        G.step = G.tempdouble2 * G.pressuredouble1;
        G.answer = G.step / G.pressuredouble2;

    }

    //Solves for pressure
    public static void pvt() {

        checker();

        G.step = G.pressuredouble2 * G.volumedouble2 * G.tempdouble1;
        G.answer = G.step / (G.tempdouble2 * G.volumedouble1);
    }

    //Solves for volume
    public static void pvt2() {

        checker();

        G.step = G.pressuredouble2 * G.volumedouble2 * G.tempdouble1;
        G.answer = G.step / (G.tempdouble2 * G.pressuredouble1);
    }

    //Solves for temperature
    public static void pvt3() {

        checker();

        G.step = G.tempdouble2 * G.pressuredouble1 * G.volumedouble1;
        G.answer = G.step / (G.pressuredouble2 * G.volumedouble2);
    }

    //Solves for volume
    public static void vn() {

        checker();

        G.step = G.volumedouble2 * G.molesdouble1;
        G.answer = G.step / G.molesdouble2;

    }

    //Solves for moles
    public static void vn2() {

        checker();

        G.step = G.molesdouble2 * G.volumedouble1;
        G.answer = G.step / G.volumedouble2;
    }

    //Solves for pressure
    public static void pvnrt() {

        checker();

        G.step = G.molesdouble1 * 0.082 * G.tempdouble1;
        G.answer = G.step / G.volumedouble1;
    }

    //Solves for volume
    public static void pvnrt2() {

        checker();

        G.step = G.molesdouble1 * 0.082 * G.tempdouble1;
        G.answer = G.step / G.pressuredouble1;
    }

    //Solves for moles
    public static void pvnrt3() {

        checker();

        G.step = G.pressuredouble1 * G.volumedouble1;
        G.answer = G.step / (0.082 * G.tempdouble1);
    }

    //Solves for temperature
    public static void pvnrt4() {

        checker();

        G.step = G.pressuredouble1 * G.volumedouble1;
        G.answer = G.step / (0.082 * G.molesdouble1);
    }

    //Solves for pressure
    public static void pn() {

        checker();

        G.step = G.pressuredouble2 * G.molesdouble1;
        G.answer = G.step / G.molesdouble2;
    }

    //Solves for moles
    public static void pn2() {

        checker();

        G.step = G.pressuredouble1 * G.molesdouble2;
        G.answer = G.step / G.pressuredouble2;
    }

    //Solves for moles
    public static void nt() {

        checker();

        G.step = G.molesdouble2 * G.tempdouble2;
        G.answer = G.step / G.tempdouble1;
    }

    //Solves for temperature
    public static void nt2() {

        checker();

        G.step = G.molesdouble2 * G.tempdouble2;
        G.answer = G.step / G.molesdouble1;
    }

}

