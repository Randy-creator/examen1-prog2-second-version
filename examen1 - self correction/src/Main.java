import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
                // Création des objets
                Solo adeleArtist = new Solo("1", "Adele", "UK", 2008, "Adele", "Adkins", LocalDate.of(1988, 5, 5));
                Album albumTwentyOne = new Album("21", adeleArtist);

                // Création des musiques
                Music songRollingInTheDeep = new Music("1", "Rolling in the Deep", 228, Genre.POP, adeleArtist);
                Music songSomeoneLikeYou = new Music("2", "Someone Like You", 285, Genre.POP, adeleArtist);

                // Ajouter des musiques à l'album
                albumTwentyOne.addMusicToAlbum(songRollingInTheDeep);
                albumTwentyOne.addMusicToAlbum(songSomeoneLikeYou);

                // Création de la playlist
                Playlist adeleHitsPlaylist = new Playlist("Adele Hits Playlist");
                adeleHitsPlaylist.addToPlaylist(songRollingInTheDeep);
                adeleHitsPlaylist.addToPlaylist(albumTwentyOne);

                // Création de l'utilisateur
                User userEmma = new User("1", "emma_smith", adeleHitsPlaylist);

                // L'utilisateur aime la playlist
                adeleHitsPlaylist.liked(userEmma);

                // Affichage des informations
                System.out.println("Total likes: " + adeleHitsPlaylist.getTotalLikes());

                // Afficher la liste des chansons restantes dans la playlist
                System.out.println("Chansons restantes dans la playlist: " + adeleHitsPlaylist.getListOfMusic());
        }
}
