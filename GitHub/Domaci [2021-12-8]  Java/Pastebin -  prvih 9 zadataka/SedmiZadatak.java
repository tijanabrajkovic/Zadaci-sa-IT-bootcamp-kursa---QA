import java.util.Scanner;
/*
7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
 */

public class SedmiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dan rodjenja: ");
        int dan = sc.nextInt();
        System.out.println("Unesite mesec rodjenja: ");
        int mesec = sc.nextInt();
        String c = "Vas horoskopski znak je: ";
        switch (mesec) {
            case 1: {
                if (dan > 0 && dan <= 20) {
                    System.out.println(c + "Jarac");
                } else if (dan >= 21 && dan <= 31) {
                    System.out.println(c + "Vodolija");
                }
                break;
            }

            case 2: {
                if (dan > 0 && dan <= 19) {
                    System.out.println(c + "Vodolija");
                } else if (dan >= 20 && dan <= 29) {
                    System.out.println(c + "Ribe");
                }
                break;
            }
            case 3: {
                if (dan > 0 && dan <= 20) {
                    System.out.println(c + "Ribe");
                } else if (dan >= 21 && dan <= 31) {
                    System.out.println(c + "Ovan");
                } break;

            }
            case 4: {
                if (dan > 0 && dan <= 20) {
                    System.out.println(c + "Ovan");
                } else if (dan >= 21 && dan <= 30) {
                    System.out.println(c + "Bik");
                } break;
            }
            case 5: {
                if (dan > 0 && dan <= 21) {
                    System.out.println(c + "Bik");
                } else if (dan >= 22 && dan <= 30) {
                    System.out.println(c + "Blizanci");
                } break;
            }
            case 6: {
                if (dan > 0 && dan <= 21) {
                    System.out.println(c + "Blizanci");
                } else if (dan >= 22 && dan <= 30) {
                    System.out.println(c + "Rak");
                } break;
            }
            case 7: {
                if (dan > 0 && dan <= 22) {
                    System.out.println(c + "Rak");
                } else if (dan >= 23 && dan <= 31) {
                    System.out.println(c + "Lav");
                } break;

            }
            case 8: {
                if (dan > 0 && dan <= 22) {
                    System.out.println(c + "Lav");
                } else if (dan >= 23 && dan <= 31) {
                    System.out.println(c + "Devica");
                } break;
            }
            case 9: {
                if (dan > 0 && dan <= 22) {
                    System.out.println(c + "Devica");
                } else if (dan >= 23 && dan <= 30) {
                    System.out.println(c + "Vaga");
                } break;
            }
            case 10: {
                if (dan > 0 && dan <= 23) {
                    System.out.println(c + "Vaga");
                } else if (dan >= 24 && dan <= 31) {
                    System.out.println(c + "Skorpija");
                } break;
            }
            case 11: {
                if (dan> 0 && dan<=22) {
                    System.out.println(c + "Skorpija");
                }
                    else if (dan>=23 && dan<=30) {
                    System.out.println(c+ "Strelac");
                }
                    break;
            }
            case 12: {
                if (dan> 0 && dan<=21) {
                    System.out.println(c + "Strelac");
                } else if (dan>=22 && dan<=31) {
                    System.out.println(c + "Jarac");
                }
                break;

            }
            default:
                System.out.println("Nije dobar unos");
                break;


        }

    }
}


