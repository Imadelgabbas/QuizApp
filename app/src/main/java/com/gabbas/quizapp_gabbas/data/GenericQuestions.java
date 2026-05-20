package com.gabbas.quizapp_gabbas.data;

import static com.gabbas.quizapp_gabbas.data.QuestionFactory.easy;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.hard;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.medium;

import java.util.ArrayList;

public class GenericQuestions {

    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();
        if (category == null) {
            return questions;
        }

        switch (category) {
            case "Géographie":
                addGeographyQuestions(questions);
                break;
            case "Science":
                addScienceQuestions(questions);
                break;
            case "Sport":
                addSportQuestions(questions);
                break;
            case "Films":
                addFilmQuestions(questions);
                break;
            case "Culture générale":
                addCultureQuestions(questions);
                break;
            default:
                break;
        }

        return questions;
    }

    private static void addGeographyQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel est le plus grand continent par superficie ?", 1, "Afrique", "Asie", "Amérique du Nord", "Europe"));
        questions.add(easy("Quelle est la capitale de la France ?", 2, "Londres", "Berlin", "Paris", "Rome"));
        questions.add(easy("Quel océan est le plus vaste ?", 2, "Atlantique", "Indien", "Pacifique", "Arctique"));
        questions.add(easy("Quel est le plus haut sommet du monde ?", 2, "K2", "Mont Blanc", "Everest", "Kilimandjaro"));
        questions.add(easy("Dans quel pays se trouve la Grande Muraille ?", 2, "Japon", "Corée du Sud", "Chine", "Thaïlande"));
        questions.add(easy("Quel pays est surnommé le Pays du Soleil Levant ?", 1, "Chine", "Japon", "Australie", "Brésil"));
        questions.add(new Question("Quelle est la capitale de l'Espagne ?", new String[]{"Lisbonne", "Madrid", "Barcelone", "Séville"}, 1, "EASY"));
        questions.add(new Question("Quel pays a pour capitale Ottawa ?", new String[]{"Australie", "États-Unis", "Canada", "Irlande"}, 2, "EASY"));

        questions.add(medium("Quel fleuve est généralement présenté comme le plus long du monde dans les quiz scolaires ?", 1, "Amazone", "Nil", "Mississippi", "Danube"));
        questions.add(medium("Quel pays est le plus peuplé du monde depuis 2023 ?", 0, "Inde", "Chine", "États-Unis", "Indonésie"));
        questions.add(medium("Quelle est la capitale de l'Australie ?", 1, "Sydney", "Canberra", "Melbourne", "Perth"));
        questions.add(medium("Quel désert chaud couvre une grande partie de l'Afrique du Nord ?", 1, "Kalahari", "Sahara", "Gobi", "Atacama"));
        questions.add(medium("Dans quelle ville se trouve le Big Ben ?", 0, "Londres", "Dublin", "Glasgow", "Liverpool"));
        questions.add(medium("Quel pays d'Amérique du Sud est le plus vaste ?", 2, "Argentine", "Pérou", "Brésil", "Chili"));
        questions.add(new Question("Quelle rivière traverse Budapest ?", new String[]{"Volga", "Danube", "Tibre", "Douro"}, 1, "MEDIUM"));
        questions.add(new Question("Quel pays africain a Nairobi pour capitale ?", new String[]{"Kenya", "Tanzanie", "Ouganda", "Éthiopie"}, 0, "MEDIUM"));

        questions.add(hard("Quel archipel d'Asie du Sud-Est compte le plus grand nombre d'îles au monde ?", 1, "Philippines", "Indonésie", "Japon", "Maldives"));
        questions.add(hard("Comment s'appelle la fosse océanique la plus profonde connue ?", 2, "Fosse des Tonga", "Fosse du Japon", "Fosse des Mariannes", "Fosse du Pérou"));
        questions.add(hard("Quel est le plus petit État souverain du monde ?", 3, "Monaco", "Saint-Marin", "Malte", "Vatican"));
        questions.add(new Question("Quelle capitale européenne est traversée par le Tage ?", new String[]{"Madrid", "Rome", "Lisbonne", "Athènes"}, 2, "HARD"));
    }

    private static void addScienceQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quelle est la planète la plus proche du Soleil ?", 3, "Vénus", "Terre", "Mars", "Mercure"));
        questions.add(easy("Quel est le symbole chimique de l'eau ?", 1, "CO2", "H2O", "O2", "NaCl"));
        questions.add(easy("Qui a formulé la théorie de la relativité ?", 1, "Isaac Newton", "Albert Einstein", "Galilée", "Nikola Tesla"));
        questions.add(easy("Quel organe pompe le sang dans le corps humain ?", 2, "Poumon", "Cerveau", "Cœur", "Foie"));
        questions.add(easy("Quel gaz les plantes absorbent-elles pour la photosynthèse ?", 2, "Oxygène", "Azote", "Dioxyde de carbone", "Hydrogène"));
        questions.add(easy("Combien de dents possède généralement un adulte ?", 2, "28", "30", "32", "34"));
        questions.add(new Question("Combien de planètes compte le Système solaire ?", new String[]{"7", "8", "9", "10"}, 1, "EASY"));
        questions.add(new Question("Quel métal est liquide à température ambiante ?", new String[]{"Fer", "Mercure", "Cuivre", "Aluminium"}, 1, "EASY"));

        questions.add(medium("Quelle est l'unité de mesure de la force ?", 2, "Watt", "Joule", "Newton", "Volt"));
        questions.add(medium("Quelle est la vitesse approximative de la lumière ?", 0, "300 000 km/s", "150 000 km/s", "1 000 000 km/s", "50 000 km/s"));
        questions.add(medium("Quel gaz est le plus abondant dans l'atmosphère terrestre ?", 1, "Oxygène", "Azote", "Argon", "Hydrogène"));
        questions.add(medium("Dans quelle partie de la cellule se trouve l'essentiel du matériel génétique ?", 0, "Noyau", "Membrane", "Cytoplasme", "Mitochondrie"));
        questions.add(medium("Quels organes filtrent principalement le sang ?", 1, "Poumons", "Reins", "Intestins", "Yeux"));
        questions.add(medium("Quelle vitamine est synthétisée par la peau grâce au soleil ?", 3, "Vitamine A", "Vitamine B12", "Vitamine C", "Vitamine D"));
        questions.add(new Question("Quel organe produit l'insuline dans le corps humain ?", new String[]{"Pancréas", "Foie", "Cœur", "Poumon"}, 0, "MEDIUM"));
        questions.add(new Question("Comment appelle-t-on le centre d'un atome ?", new String[]{"Membrane", "Noyau", "Orbiteur", "Cristal"}, 1, "MEDIUM"));

        questions.add(hard("Quelle est la valeur du pH neutre ?", 1, "5", "7", "8", "10"));
        questions.add(hard("Quelle est la forme classique de la molécule d'ADN ?", 2, "Spirale simple", "Anneau", "Double hélice", "Cube"));
        questions.add(hard("À quelle température approximative se situe le zéro absolu ?", 0, "-273,15 °C", "-100 °C", "0 °C", "-459 °C"));
        questions.add(new Question("Quel physicien a formulé les lois du mouvement avant la relativité d'Einstein ?", new String[]{"Galilée", "Isaac Newton", "Niels Bohr", "Michael Faraday"}, 1, "HARD"));
    }

    private static void addSportQuestions(ArrayList<Question> questions) {
        questions.add(easy("Tous les combien d'années ont lieu les Jeux olympiques d'été ?", 1, "2 ans", "4 ans", "6 ans", "8 ans"));
        questions.add(easy("Quel sport est associé à Wimbledon ?", 2, "Football", "Rugby", "Tennis", "Golf"));
        questions.add(easy("Combien de joueurs y a-t-il dans une équipe de football sur le terrain ?", 2, "9", "10", "11", "12"));
        questions.add(easy("Quel pays a remporté la Coupe du monde de football 2018 ?", 2, "Brésil", "Allemagne", "France", "Argentine"));
        questions.add(easy("Dans quel sport utilise-t-on un palet ?", 1, "Basketball", "Hockey sur glace", "Handball", "Baseball"));
        questions.add(easy("Quelle est la distance officielle d'un marathon ?", 1, "21 km", "42,195 km", "50 km", "100 km"));
        questions.add(new Question("Quel pays a remporté la Coupe du monde de football 2022 ?", new String[]{"France", "Argentine", "Croatie", "Brésil"}, 1, "EASY"));
        questions.add(new Question("Dans quel sport se joue le tournoi de Roland-Garros ?", new String[]{"Tennis", "Golf", "Rugby", "Squash"}, 0, "EASY"));

        questions.add(medium("Qui est souvent surnommé le Roi du football ?", 1, "Maradona", "Pelé", "Zidane", "Messi"));
        questions.add(medium("Quel pilote de Formule 1 compte 7 titres mondiaux comme Lewis Hamilton ?", 1, "Alain Prost", "Michael Schumacher", "Ayrton Senna", "Sebastian Vettel"));
        questions.add(medium("Combien d'anneaux comporte le drapeau olympique ?", 2, "4", "6", "5", "7"));
        questions.add(medium("Quel pays a organisé la Coupe du monde de football 2022 ?", 3, "Émirats arabes unis", "Arabie saoudite", "Égypte", "Qatar"));
        questions.add(medium("Dans quel sport utilise-t-on le terme birdie ?", 2, "Tennis", "Baseball", "Golf", "Cricket"));
        questions.add(medium("Combien de points vaut un tir derrière l'arc au basketball ?", 2, "1", "2", "3", "4"));
        questions.add(new Question("Combien de joueurs y a-t-il dans une équipe de basketball sur le terrain ?", new String[]{"4", "5", "6", "7"}, 1, "MEDIUM"));
        questions.add(new Question("Quel nageur américain a remporté 23 titres olympiques ?", new String[]{"Mark Spitz", "Ryan Lochte", "Michael Phelps", "Ian Thorpe"}, 2, "MEDIUM"));

        questions.add(hard("Dans quel pays le judo a-t-il été codifié ?", 1, "Chine", "Japon", "Corée du Sud", "Thaïlande"));
        questions.add(hard("Quel tournoi du Grand Chelem se joue sur terre battue ?", 3, "Wimbledon", "US Open", "Open d'Australie", "Roland-Garros"));
        questions.add(hard("Quelle est la durée réglementaire d'un match de rugby à XV ?", 0, "80 minutes", "70 minutes", "90 minutes", "100 minutes"));
        questions.add(new Question("Quel pays a codifié le rugby moderne au XIXe siècle ?", new String[]{"France", "Nouvelle-Zélande", "Angleterre", "Écosse"}, 2, "HARD"));
    }

    private static void addFilmQuestions(ArrayList<Question> questions) {
        questions.add(easy("Qui a réalisé le film Jurassic Park ?", 1, "James Cameron", "Steven Spielberg", "Christopher Nolan", "Martin Scorsese"));
        questions.add(easy("Quel film d'animation met en scène Simba ?", 1, "Toy Story", "Le Roi Lion", "Aladdin", "Shrek"));
        questions.add(easy("Dans Star Wars, qui est le père de Luke Skywalker ?", 1, "Obi-Wan Kenobi", "Dark Vador", "Yoda", "Palpatine"));
        questions.add(easy("Quel film a remporté l'Oscar du meilleur film en 2020 ?", 1, "1917", "Parasite", "Joker", "The Irishman"));
        questions.add(easy("Quel acteur incarne Jack Sparrow ?", 1, "Brad Pitt", "Johnny Depp", "Tom Cruise", "Leonardo DiCaprio"));
        questions.add(easy("Qui tient le rôle principal dans la saga Mission Impossible ?", 1, "Will Smith", "Tom Cruise", "Matt Damon", "Jason Statham"));
        questions.add(new Question("Quel jeune sorcier porte une cicatrice en forme d'éclair ?", new String[]{"Frodon", "Harry Potter", "Percy Jackson", "Bilbo"}, 1, "EASY"));
        questions.add(new Question("Quel film d'animation présente une reine nommée Elsa ?", new String[]{"Raiponce", "La Reine des neiges", "Vaiana", "Encanto"}, 1, "EASY"));

        questions.add(medium("Comment s'appelle l'ordinateur dans 2001, l'Odyssée de l'espace ?", 1, "Jarvis", "HAL 9000", "Skynet", "Cortana"));
        questions.add(medium("Quel est le premier long métrage d'animation de Disney ?", 1, "Cendrillon", "Blanche-Neige et les Sept Nains", "Pinocchio", "Bambi"));
        questions.add(medium("Qui a réalisé Titanic ?", 0, "James Cameron", "Peter Jackson", "George Lucas", "Robert Zemeckis"));
        questions.add(medium("Dans Matrix, comment s'appelle l'Élu ?", 2, "Morpheus", "Trinity", "Neo", "Smith"));
        questions.add(medium("Quel pays a produit Le Voyage de Chihiro ?", 2, "Chine", "Corée du Sud", "Japon", "Thaïlande"));
        questions.add(medium("Qui a réalisé Inception ?", 3, "Denis Villeneuve", "Ridley Scott", "David Fincher", "Christopher Nolan"));
        questions.add(new Question("Quel réalisateur a créé la saga Star Wars ?", new String[]{"Steven Spielberg", "George Lucas", "James Cameron", "Peter Jackson"}, 1, "MEDIUM"));
        questions.add(new Question("Quel acteur incarne Iron Man dans l'univers cinématographique Marvel ?", new String[]{"Chris Evans", "Chris Hemsworth", "Robert Downey Jr.", "Mark Ruffalo"}, 2, "MEDIUM"));

        questions.add(hard("Quel acteur a incarné le Joker dans The Dark Knight ?", 0, "Heath Ledger", "Joaquin Phoenix", "Jack Nicholson", "Jared Leto"));
        questions.add(hard("Quel studio a produit le film Casablanca de 1942 ?", 2, "Paramount", "MGM", "Warner Bros.", "Universal"));
        questions.add(hard("Dans Casablanca, comment s'appelle le mari d'Ilsa Lund ?", 1, "Sam Spade", "Victor Laszlo", "Louis Renault", "Ugarte"));
        questions.add(new Question("Quel réalisateur japonais a signé le film Les Sept Samouraïs ?", new String[]{"Yasujiro Ozu", "Hayao Miyazaki", "Akira Kurosawa", "Takeshi Kitano"}, 2, "HARD"));
    }

    private static void addCultureQuestions(ArrayList<Question> questions) {
        questions.add(easy("Qui a peint la Joconde ?", 2, "Claude Monet", "Vincent van Gogh", "Léonard de Vinci", "Pablo Picasso"));
        questions.add(easy("Quelle est la capitale de l'Italie ?", 3, "Milan", "Naples", "Venise", "Rome"));
        questions.add(easy("En quelle année a débuté la Seconde Guerre mondiale ?", 1, "1914", "1939", "1945", "1918"));
        questions.add(easy("Quel est le plus grand mammifère terrestre ?", 2, "Rhinocéros", "Hippopotame", "Éléphant d'Afrique", "Girafe"));
        questions.add(easy("Quel pays a offert la Statue de la Liberté aux États-Unis ?", 2, "Royaume-Uni", "Allemagne", "France", "Espagne"));
        questions.add(easy("Qui a écrit Les Misérables ?", 1, "Émile Zola", "Victor Hugo", "Gustave Flaubert", "Albert Camus"));
        questions.add(new Question("Qui a peint le tableau Guernica ?", new String[]{"Claude Monet", "Pablo Picasso", "Salvador Dalí", "Paul Cézanne"}, 1, "EASY"));
        questions.add(new Question("Dans quel pays est né le tango ?", new String[]{"Espagne", "Mexique", "Argentine", "Portugal"}, 2, "EASY"));

        questions.add(medium("Quelle langue est la plus parlée au monde en nombre de locuteurs natifs ?", 1, "Anglais", "Chinois mandarin", "Espagnol", "Hindi"));
        questions.add(medium("Quel instrument est un instrument à vent ?", 2, "Piano", "Violon", "Flûte", "Guitare"));
        questions.add(medium("Qui a marché le premier sur la Lune ?", 0, "Neil Armstrong", "Buzz Aldrin", "Youri Gagarine", "John Glenn"));
        questions.add(medium("Quelle monnaie est utilisée au Japon ?", 3, "Yuan", "Won", "Dollar", "Yen"));
        questions.add(medium("Qui a peint La Nuit étoilée ?", 1, "Claude Monet", "Vincent van Gogh", "Salvador Dalí", "Edvard Munch"));
        questions.add(medium("Qui est associé à l'invention du téléphone ?", 0, "Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "Alan Turing"));
        questions.add(new Question("Quelle écrivaine a créé la saga Harry Potter ?", new String[]{"J.K. Rowling", "Jane Austen", "Agatha Christie", "Virginia Woolf"}, 0, "MEDIUM"));
        questions.add(new Question("Quel mur est tombé en 1989 en Allemagne ?", new String[]{"Mur d'Hadrien", "Mur de Berlin", "Mur des Lamentations", "Mur de Vienne"}, 1, "MEDIUM"));

        questions.add(hard("Quelle civilisation a construit Machu Picchu ?", 2, "Aztèque", "Maya", "Inca", "Romaine"));
        questions.add(hard("Qui est l'auteur de L'Odyssée ?", 3, "Virgile", "Socrate", "Sophocle", "Homère"));
        questions.add(hard("Quel est le plus petit pays du monde ?", 0, "Vatican", "Monaco", "Andorre", "Liechtenstein"));
        questions.add(new Question("Quel philosophe grec a enseigné au Lycée d'Athènes ?", new String[]{"Platon", "Aristote", "Épicure", "Pythagore"}, 1, "HARD"));
    }
}
