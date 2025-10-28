public class SongSimulation {
    static void main() {
        String[] lyrics = {
                "Chehre waise kayi, jod tera-mera sahi",
                "Saanu Rabb ne banaya jivein ikk-dooje layi",
                "Gulzar nu bulavaan, kujh tere 'te likhavaan",
                "Mainu Sanghe di shayari kamzor lagdi",
                "Yaad-yood auna gall door di aa",
                "Ajj-kal saanu teri tod lagdi",
                "Oh, yaad-yood auna gall hor hundi aa",
                "Ajj-kal saanu teri tod lagdi",
        };
        System.out.println("Starting the song..\n");
        for (String line : lyrics) {
            printSlowly(line,50);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n Song finished..");
    }
    public static void printSlowly(String text,int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
