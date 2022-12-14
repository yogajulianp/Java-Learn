import Logic.logic01.Logic01Soal01;
import Logic.logic01.Logic01Soal02;
import Logic.logic02.Logic02Soal01;

public class MainLogic {
    public static void main(String[] args) {
        Logic02Soal01 logic02Soal01 = new Logic02Soal01(9);
        logic02Soal01.cetakArray();

        Logic01Soal01 logic01Soal01 = new Logic01Soal01(9);
        logic01Soal01.cetakArray();

        Logic01Soal02 logic01Soal02 = new Logic01Soal02(9);
        logic01Soal02.cetakArray();
    }
}
