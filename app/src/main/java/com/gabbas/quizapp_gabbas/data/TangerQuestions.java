package com.gabbas.quizapp_gabbas.data;

import static com.gabbas.quizapp_gabbas.data.QuestionFactory.easy;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.hard;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.medium;

import java.util.ArrayList;

public class TangerQuestions {

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
        questions.add(easy("Tanger est située sur quel détroit ?", 0, "Détroit de Gibraltar", "Détroit de Messine", "Détroit de Magellan", "Détroit d'Ormuz"));
        questions.add(easy("Quels deux espaces maritimes se rencontrent près de Tanger ?", 0, "Atlantique et Méditerranée", "Mer Rouge et golfe Persique", "Océan Indien et Pacifique", "Mer Noire et Caspienne"));
        questions.add(easy("Quelle ville espagnole est visible depuis Tanger par temps clair ?", 2, "Madrid", "Barcelone", "Tarifa", "Séville"));
        questions.add(easy("Comment appelle-t-on le cap le plus connu près de Tanger ?", 0, "Cap Spartel", "Cap Vert", "Cap Horn", "Cap Sounion"));
        questions.add(easy("Dans quelle région se trouve Tanger ?", 0, "Tanger-Tétouan-Al Hoceïma", "Casablanca-Settat", "Oriental", "Souss-Massa"));
        questions.add(easy("Tanger est surnommée la ville ... ?", 0, "Blanche", "Bleue", "Rouge", "Verte"));
        questions.add(new Question("Quel grand port à conteneurs se trouve à l'est de Tanger ?", new String[]{"Tanger Med", "Port d'Agadir", "Casa-Port", "Port de Safi"}, 0, "EASY"));
        questions.add(new Question("Quel cap marque l'entrée de l'Atlantique près de Tanger ?", new String[]{"Cap Spartel", "Cap Ghir", "Cap Rhir", "Cap Juby"}, 0, "EASY"));

        questions.add(medium("Quel grand port moderne est l'un des plus importants d'Afrique au nord du Maroc ?", 1, "Port de Casablanca", "Tanger Med", "Port de Safi", "Port de Nador"));
        questions.add(medium("Les Grottes d'Hercule se situent près de quelle ville ?", 2, "Marrakech", "Rabat", "Tanger", "Agadir"));
        questions.add(medium("Quel célèbre marché historique se trouve à l'entrée de la médina de Tanger ?", 3, "Jemaa el-Fna", "Bab Doukkala", "Place des Nations", "Grand Socco"));
        questions.add(medium("Quel petit port de Tanger est fréquenté par les pêcheurs et les ferries urbains ?", 0, "Le port de Tanger Ville", "Le port d'El Jadida", "Le port de Laâyoune", "Le port de Tarfaya"));
        questions.add(medium("Quelle montagne ou chaîne domine l'arrière-pays tangérois ?", 1, "Haut Atlas", "Rif", "Anti-Atlas", "Moyen Atlas"));
        questions.add(medium("Quel promontoire relie Tanger à l'image du nord extrême du Maroc ?", 2, "Cap Blanc", "Cap Juby", "Cap Spartel", "Cap Rhir"));
        questions.add(new Question("Comment s'appelle le front de mer rénové qui longe le détroit à Tanger ?", new String[]{"Baie de Tanger", "Bouregreg Marina", "Corniche d'Aïn Diab", "Marina Smir"}, 0, "MEDIUM"));
        questions.add(new Question("Quel quartier perché domine la médina et le port de Tanger ?", new String[]{"Hay Mohammadi", "La Kasbah", "Maârif", "Agdal"}, 1, "MEDIUM"));

        questions.add(hard("Quel site naturel au sud-ouest de Tanger est associé à la légende d'Hercule ?", 1, "Parc Perdicaris", "Grottes d'Hercule", "Merdja Zerga", "Lixus"));
        questions.add(hard("Quel nom porte le boulevard maritime moderne de Tanger face au détroit ?", 3, "Bouregreg Walk", "Anfa Promenade", "Corniche Aïn Diab", "Corniche Mohammed VI"));
        questions.add(hard("Tanger se situe face à quel pays européen ?", 2, "France", "Italie", "Espagne", "Portugal"));
        questions.add(new Question("Quel parc forestier de Tanger porte le nom d'un diplomate américain ?", new String[]{"Parc Perdicaris", "Jnan Sbil", "Anfa Park", "Parc Hassan II"}, 0, "HARD"));
    }

    private static void addScienceQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel phénomène maritime unique se produit au détroit de Gibraltar ?", 0, "Rencontre de deux courants", "Gel permanent", "Eau douce en surface", "Marée noire naturelle"));
        questions.add(easy("Quel climat domine à Tanger ?", 0, "Méditerranéen avec influence atlantique", "Désertique", "Tropical humide", "Polaire"));
        questions.add(easy("Le vent célèbre qui souffle à Tanger s'appelle ?", 2, "Sirocco", "Chergui", "Levant", "Mistral"));
        questions.add(easy("Tanger est-elle située dans une zone sismique sensible ?", 0, "Oui", "Non", "Jamais", "Seulement au sud marocain"));
        questions.add(easy("Quelle énergie renouvelable est très présente près de Tanger ?", 1, "Nucléaire", "Éolienne", "Géothermique", "Hydraulique tropicale"));
        questions.add(easy("Pourquoi l'air de Tanger est-il souvent plus humide que celui de Marrakech ?", 2, "À cause du Sahara", "À cause de la neige", "À cause de la proximité maritime", "À cause des volcans"));
        questions.add(new Question("Quel port moderne de Tanger illustre la logistique maritime de pointe du Maroc ?", new String[]{"Tanger Med", "Port de Ksar Sghir antique", "Port de Safi", "Port de Nador West Med"}, 0, "EASY"));
        questions.add(new Question("Quel phénomène venteux favorise l'énergie éolienne près de Tanger ?", new String[]{"Les vents du détroit", "Le gel sibérien", "Les vents alpins", "Les moussons d'Asie"}, 0, "EASY"));

        questions.add(medium("Quel détroit crée une forte circulation de vents entre Atlantique et Méditerranée ?", 1, "Bosphore", "Gibraltar", "Canal de Suez", "Bab-el-Mandeb"));
        questions.add(medium("Quel courant aide à renouveler les eaux entre les deux bassins marins ?", 0, "Courants de surface et de profondeur", "Courant du Nil", "Courant alpin", "Courant himalayen"));
        questions.add(medium("Quel parc naturel boisé se trouve à l'ouest de Tanger ?", 1, "Parc national de Toubkal", "Parc Perdicaris", "Parc de la Ligue arabe", "Parc Ifrane"));
        questions.add(medium("Quelle activité scientifique est favorisée par les vents forts au nord du Maroc ?", 3, "Volcanologie", "Glaciologie", "Pétrochimie", "Études éoliennes"));
        questions.add(medium("Quel type d'oiseaux migrateurs transite souvent par le détroit de Gibraltar ?", 2, "Pingouins", "Colibris", "Rapaces et cigognes", "Autruches"));
        questions.add(medium("Pourquoi Tanger intéresse-t-elle les chercheurs en climat côtier ?", 1, "Pour ses glaciers", "Pour l'interaction de deux façades maritimes", "Pour ses geysers", "Pour ses volcans sous-marins"));
        questions.add(new Question("Quel parc boisé de Tanger permet d'observer des écosystèmes littoraux ?", new String[]{"Parc Perdicaris", "Jardin Majorelle", "Ménara", "Parc de la Ligue arabe"}, 0, "MEDIUM"));
        questions.add(new Question("Quel passage maritime fait de Tanger un site majeur pour l'observation des migrations d'oiseaux ?", new String[]{"Détroit du Bosphore", "Canal de Suez", "Détroit de Gibraltar", "Mer Noire"}, 2, "MEDIUM"));

        questions.add(hard("Quel site industriel du nord marocain illustre la logistique moderne autour de Tanger ?", 0, "Tanger Med et sa zone franche", "Noor Ouarzazate", "Bouregreg Valley", "Aïn Sebaâ Port"));
        questions.add(hard("Quel détroit fait de Tanger un point stratégique pour l'étude des échanges marins ?", 1, "Bosphore", "Gibraltar", "Magellan", "Behring"));
        questions.add(hard("Quelle combinaison d'influences explique le microclimat de Tanger ?", 2, "Sahara et Alpes", "Nil et Andes", "Atlantique et Méditerranée", "Arctique et désert d'Arabie"));
        questions.add(new Question("Quel type d'échanges d'eaux rend le détroit de Tanger scientifiquement important ?", new String[]{"Seulement des eaux douces", "Des courants de surface et de profondeur", "Des marées polaires uniquement", "Un courant venant du Nil"}, 1, "HARD"));
    }

    private static void addSportQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel est le club de football phare de Tanger ?", 0, "IRT Tanger", "MAT Tétouan", "WAC", "Raja CA"));
        questions.add(easy("Comment s'appelle le grand stade de Tanger ?", 0, "Stade Ibn Battouta", "Stade Mohammed V", "Stade Moulay Abdellah", "Stade Adrar"));
        questions.add(easy("Les couleurs de l'Ittihad de Tanger sont ?", 1, "Vert et blanc", "Bleu et blanc", "Rouge et blanc", "Jaune et noir"));
        questions.add(easy("Tanger a-t-elle accueilli le Trophée des Champions français ?", 0, "Oui", "Non", "Jamais", "Seulement en projet"));
        questions.add(easy("Quel sport nautique est très pratiqué sur les plages de Tanger ?", 1, "Surf en rivière", "Planche à voile / kitesurf", "Curling marin", "Ski alpin"));
        questions.add(easy("Quel grand voyageur né à Tanger a donné son nom au stade de la ville ?", 2, "Ibn Rochd", "Al Idrissi", "Ibn Battouta", "Moulay Ismaïl"));
        questions.add(new Question("Quel club joue au stade Ibn Battouta de Tanger ?", new String[]{"IRT Tanger", "FUS Rabat", "KACM", "MAS Fès"}, 0, "EASY"));
        questions.add(new Question("Quel voyageur marocain a donné son nom au grand stade de Tanger ?", new String[]{"Ibn Rochd", "Ibn Battouta", "Al Khwarizmi", "Al Idrissi"}, 1, "EASY"));

        questions.add(medium("Quel club tangérois est abrégé IRT ?", 0, "Ittihad Riadi de Tanger", "International Racing Tangier", "Institut Royal de Tanger", "Ifrane Racing Team"));
        questions.add(medium("Le stade Ibn Battouta accueille régulièrement quel type de matchs ?", 2, "Uniquement du rugby", "Uniquement des concerts", "Des matchs nationaux et internationaux", "Seulement du base-ball"));
        questions.add(medium("Quel avantage offre le littoral tangérois pour l'entraînement nautique ?", 1, "L'eau douce", "Le vent régulier", "La glace permanente", "L'absence totale de vagues"));
        questions.add(medium("Quel club voisin constitue un rival régional de l'IRT Tanger ?", 0, "Moghreb Tétouan", "Kawkab Marrakech", "FUS Rabat", "Olympique Safi"));
        questions.add(medium("Quel événement a renforcé la notoriété du stade de Tanger au niveau international ?", 3, "Le Dakar", "La Ryder Cup", "Les JO d'hiver", "Le Trophée des Champions"));
        questions.add(medium("Quel sport collectif reste le plus suivi à Tanger ?", 1, "Baseball", "Football", "Hockey", "Lacrosse"));
        questions.add(new Question("Quel sport de glisse profite des vents du détroit près de Tanger ?", new String[]{"Kitesurf", "Bobsleigh", "Curling", "Saut à ski"}, 0, "MEDIUM"));
        questions.add(new Question("Quel grand trophée français de football s'est joué à Tanger ?", new String[]{"Coupe de la Ligue", "Trophée des Champions", "Coupe de France féminine", "Challenge des espoirs"}, 1, "MEDIUM"));

        questions.add(hard("Quelle ville a accueilli avec Rabat la Coupe du monde des clubs 2022 au Maroc ?", 2, "Agadir", "Casablanca", "Tanger", "Fès"));
        questions.add(hard("Pourquoi le stade Ibn Battouta est-il stratégique pour le sport marocain ?", 1, "Il est au milieu du désert", "Il peut accueillir de grands tournois internationaux", "Il se trouve sur une île", "Il sert de port"));
        questions.add(hard("Quel relief côtier rend possibles certaines disciplines de glisse près de Tanger ?", 0, "Les vents du détroit", "Les dunes enneigées", "Les lacs volcaniques", "Les marées polaires"));
        questions.add(new Question("Quel club tangérois s'appelle officiellement Ittihad Riadi de Tanger ?", new String[]{"IRT Tanger", "Racing Casablanca", "WAF Fès", "AS FAR"}, 0, "HARD"));
    }

    private static void addFilmQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel film de la saga James Bond a été tourné en partie à Tanger ?", 1, "Skyfall", "Tuer n'est pas jouer", "GoldenEye", "Casino Royale"));
        questions.add(easy("Dans quel film de Christopher Nolan, des scènes censées se passer à Mombasa ont été tournées à Tanger ?", 1, "Interstellar", "Inception", "Tenet", "Dunkerque"));
        questions.add(easy("Quel film de la saga Jason Bourne a une course-poursuite célèbre à Tanger ?", 1, "La Mémoire dans la peau", "La Vengeance dans la peau", "Jason Bourne", "The Bourne Legacy"));
        questions.add(easy("Only Lovers Left Alive se déroule en grande partie dans quelle ville marocaine ?", 1, "Marrakech", "Tanger", "Rabat", "Agadir"));
        questions.add(easy("Quel écrivain de la Beat Generation installé à Tanger a inspiré des adaptations au cinéma ?", 1, "Jack Kerouac", "William S. Burroughs", "Allen Ginsberg", "Charles Bukowski"));
        questions.add(easy("Pourquoi Tanger attire-t-elle souvent les tournages ?", 2, "Pour ses pistes de ski", "Pour ses gratte-ciel", "Pour sa lumière et ses ruelles", "Pour ses volcans"));
        questions.add(new Question("Quel café mythique surplombant la mer nourrit l'imaginaire filmique de Tanger ?", new String[]{"Café Hafa", "Rick's Café", "Café de Flore", "Café Majorelle"}, 0, "EASY"));
        questions.add(new Question("Quel quartier ancien sert souvent de décor aux films d'espionnage à Tanger ?", new String[]{"La kasbah et la médina", "La zone industrielle", "Le parc technologique", "L'aéroport"}, 0, "EASY"));

        questions.add(medium("Quel réalisateur a mis Tanger au cœur du film Only Lovers Left Alive ?", 3, "Ridley Scott", "Danny Boyle", "Wes Anderson", "Jim Jarmusch"));
        questions.add(medium("Quel lieu de Tanger surplombant la mer est souvent associé à l'imaginaire littéraire et cinématographique ?", 1, "Rick's Café", "Café Hafa", "Café de France", "La Mamounia"));
        questions.add(medium("Quel quartier ancien de Tanger sert souvent de décor aux films d'espionnage ?", 2, "La zone industrielle", "La marina", "La kasbah et la médina", "Les dunes"));
        questions.add(medium("Quel intérêt visuel offre Tanger aux films internationaux ?", 0, "Une ville entre deux continents et deux mers", "Une jungle tropicale", "Des icebergs", "Des pyramides"));
        questions.add(medium("Quel film de la saga Bourne montre un décor urbain escarpé rappelant la médina de Tanger ?", 1, "La Mémoire dans la peau", "La Vengeance dans la peau", "Jason Bourne 2016", "The Bourne Legacy"));
        questions.add(medium("Quel type de récit s'accorde bien avec l'image de Tanger au cinéma ?", 3, "Science scolaire", "Comédie agricole", "Chronique polaire", "Espionnage et errance cosmopolite"));
        questions.add(new Question("Quel musée diplomatique américain de Tanger rappelle le passé international de la ville ?", new String[]{"Musée Batha", "American Legation", "Musée Nejjarine", "Villa des Arts"}, 1, "MEDIUM"));
        questions.add(new Question("Quel statut historique de Tanger nourrit souvent l'imaginaire des films d'espionnage ?", new String[]{"Ville impériale", "Zone internationale", "Ville minière", "Capitale du désert"}, 1, "MEDIUM"));

        questions.add(hard("Quel écrivain expatrié lié à Tanger est l'auteur du Festin nu adapté au cinéma ?", 2, "Paul Bowles", "Jack Kerouac", "William S. Burroughs", "Tennessee Williams"));
        questions.add(hard("Quelle qualité lumineuse de Tanger a fasciné des artistes comme Matisse et séduit le cinéma ?", 1, "Sa lumière boréale", "Sa lumière blanche et marine", "Sa lumière volcanique", "Sa lumière alpine"));
        questions.add(hard("Quel statut politique ancien a contribué à l'image internationale et cinématographique de Tanger ?", 0, "Zone internationale", "Capitale coloniale française", "République indépendante", "Province espagnole"));
        questions.add(new Question("Quel écrivain américain auteur du Ciel protecteur a vécu longtemps à Tanger ?", new String[]{"Ernest Hemingway", "Paul Bowles", "Albert Camus", "Henry Miller"}, 1, "HARD"));
    }

    private static void addCultureQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel célèbre voyageur et explorateur est né à Tanger ?", 1, "Marco Polo", "Ibn Battouta", "Christophe Colomb", "Vasco de Gama"));
        questions.add(easy("Pendant une partie du XXe siècle, Tanger avait quel statut spécial ?", 1, "Zone libre", "Zone internationale", "Colonie italienne", "Province ottomane"));
        questions.add(easy("Comment s'appelle le café mythique surplombant la mer à Tanger ?", 1, "Rick's Café", "Café Hafa", "Café de Paris", "Café des Nattes"));
        questions.add(easy("La Librairie des Colonnes est un lieu culturel célèbre de quelle ville ?", 2, "Rabat", "Casablanca", "Tanger", "Fès"));
        questions.add(easy("Quelle langue, en plus de l'arabe et du français, est très parlée à Tanger ?", 1, "Anglais", "Espagnol", "Allemand", "Italien"));
        questions.add(easy("Le Grand Socco est une place située à ?", 1, "Marrakech", "Tanger", "Agadir", "Meknès"));
        questions.add(new Question("Quelle place animée marque l'entrée de la médina de Tanger ?", new String[]{"Grand Socco", "Place des Ferblantiers", "Place Mohammed V de Casablanca", "Place Nejjarine"}, 0, "EASY"));
        questions.add(new Question("Quel café légendaire de Tanger surplombe le détroit ?", new String[]{"Café Hafa", "Café de France", "Rick's Café", "Café Clock"}, 0, "EASY"));

        questions.add(medium("Quel peintre célèbre a été fasciné par la lumière de Tanger ?", 1, "Picasso", "Matisse", "Van Gogh", "Dalí"));
        questions.add(medium("Le palais du Sultan à Tanger abrite aujourd'hui quel musée ?", 0, "Musée de la Kasbah", "Musée Nejjarine", "Musée Batha", "Musée Yves Saint Laurent"));
        questions.add(medium("Quel petit lieu de sociabilité historique complète le Grand Socco dans la médina ?", 3, "Place Rouge", "Menara", "Mellah", "Petit Socco"));
        questions.add(medium("Quel écrivain américain est très associé à la vie culturelle de Tanger ?", 1, "Ernest Hemingway", "Paul Bowles", "William Faulkner", "John Steinbeck"));
        questions.add(medium("Quelle institution diplomatique historique américaine se trouve à Tanger ?", 2, "L'ambassade US de Rabat", "Consulat de Casablanca", "American Legation", "Maison Blanche marocaine"));
        questions.add(medium("Quel style de vie a longtemps fait la réputation culturelle de Tanger ?", 0, "Cosmopolite et bohème", "Montagnard et fermé", "Uniquement militaire", "Purement agricole"));
        questions.add(new Question("Quelle librairie historique de Tanger est connue pour ses écrivains et intellectuels ?", new String[]{"Librairie des Colonnes", "Borj Fès Books", "Casa Roman", "Dar Batha Press"}, 0, "MEDIUM"));
        questions.add(new Question("Quel petit lieu historique complète le Grand Socco dans le vieux centre de Tanger ?", new String[]{"Petit Socco", "Place des Épices", "Bab El Had", "Place Jamaa"}, 0, "MEDIUM"));

        questions.add(hard("Quel musée ou palais rappelle l'époque où Tanger était un carrefour diplomatique mondial ?", 2, "Musée Batha", "Palais Bahia", "American Legation Museum", "Borj Nord"));
        questions.add(hard("Quel lieu culturel de Tanger témoigne du lien entre littérature et diplomatie américaine ?", 1, "La corniche Mohammed VI", "American Legation", "Morocco Mall", "Grand Théâtre"));
        questions.add(hard("Quel caractère de Tanger explique sa forte présence dans les récits d'exil et de passage ?", 0, "Sa position de ville-frontière", "Son isolement désertique", "Son absence de port", "Sa fermeture aux étrangers"));
        questions.add(new Question("Quel musée de Tanger raconte les relations diplomatiques maroco-américaines depuis le XVIIIe siècle ?", new String[]{"Musée Nejjarine", "American Legation Museum", "Musée Batha", "Musée Mohammed VI"}, 1, "HARD"));
    }
}
