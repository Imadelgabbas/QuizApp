package com.gabbas.quizapp_gabbas.data;

import static com.gabbas.quizapp_gabbas.data.QuestionFactory.easy;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.hard;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.medium;

import java.util.ArrayList;

public class MoroccoQuestions {

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
        questions.add(easy("Quelle est la capitale du Maroc ?", 1, "Casablanca", "Rabat", "Marrakech", "Fès"));
        questions.add(easy("Quel pays borde le Maroc à l'est ?", 1, "Tunisie", "Algérie", "Mauritanie", "Libye"));
        questions.add(easy("Quel détroit sépare le Maroc de l'Espagne ?", 1, "Détroit d'Ormuz", "Détroit de Gibraltar", "Détroit de Magellan", "Détroit de Sicile"));
        questions.add(easy("Quelle est la plus grande ville du Maroc ?", 1, "Rabat", "Casablanca", "Tanger", "Fès"));
        questions.add(easy("Le Maroc est bordé par quel océan à l'ouest ?", 2, "Indien", "Pacifique", "Atlantique", "Arctique"));
        questions.add(easy("Quelle ville marocaine est connue pour ses maisons bleues ?", 0, "Chefchaouen", "Essaouira", "Ifrane", "Oujda"));
        questions.add(new Question("Quelle ville marocaine est célèbre pour la place Jemaa el-Fna ?", new String[]{"Tanger", "Marrakech", "Fès", "Oujda"}, 1, "EASY"));
        questions.add(new Question("Quelle ville marocaine abrite la mosquée Hassan II ?", new String[]{"Casablanca", "Rabat", "Agadir", "Meknès"}, 0, "EASY"));

        questions.add(medium("Quel massif montagneux traverse une grande partie du Maroc ?", 1, "Le Rif", "L'Atlas", "Les Alpes", "Les Pyrénées"));
        questions.add(medium("Quel est le point culminant du Maroc ?", 0, "Mont Toubkal", "M'Goun", "Oukaïmeden", "Sirwa"));
        questions.add(medium("Quelle mer borde le nord du Maroc ?", 1, "Mer Rouge", "Mer Méditerranée", "Mer Noire", "Mer Caspienne"));
        questions.add(medium("Quelle ville espagnole enclavée se trouve sur la côte nord-est du Maroc ?", 1, "Ceuta", "Melilla", "Cadix", "Almería"));
        questions.add(medium("Quelle ville est souvent surnommée la Porte du désert ?", 2, "Agadir", "Meknès", "Ouarzazate", "Asilah"));
        questions.add(medium("Dans quelle région se situe Agadir ?", 3, "Marrakech-Safi", "Oriental", "Drâa-Tafilalet", "Souss-Massa"));
        questions.add(new Question("Quel désert marocain est célèbre pour les dunes de Merzouga ?", new String[]{"Erg Chebbi", "Désert du Sinaï", "Désert de Gobi", "Rub al-Khali"}, 0, "MEDIUM"));
        questions.add(new Question("Quelle vallée marocaine est connue pour ses oasis et palmeraies au sud ?", new String[]{"Vallée du Bouregreg", "Vallée du Drâa", "Vallée du Sebou", "Vallée du Loukkos"}, 1, "MEDIUM"));

        questions.add(hard("Quel massif montagneux occupe surtout le sud-ouest marocain ?", 2, "Rif", "Moyen Atlas", "Anti-Atlas", "Tell"));
        questions.add(hard("Quel est le plus long fleuve entièrement marocain ?", 1, "Sebou", "Drâa", "Bouregreg", "Tensift"));
        questions.add(hard("Quelle autre enclave espagnole se trouve face à Gibraltar ?", 0, "Ceuta", "Melilla", "Tarifa", "Algésiras"));
        questions.add(new Question("Quel parc national protège le massif du Toubkal au Maroc ?", new String[]{"Parc national de Toubkal", "Parc d'Ifrane", "Parc de Talassemtane", "Parc de Souss-Massa"}, 0, "HARD"));
    }

    private static void addScienceQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quelle plante marocaine produit une huile très rare et recherchée ?", 1, "Olivier", "Arganier", "Palmier", "Cactus"));
        questions.add(easy("Quelle ville est surnommée la Petite Suisse du Maroc ?", 1, "Azrou", "Ifrane", "Midelt", "Béni Mellal"));
        questions.add(easy("Le Maroc est l'un des plus grands exportateurs mondiaux de quoi ?", 1, "Pétrole", "Phosphates", "Or", "Diamants"));
        questions.add(easy("Quelle centrale solaire marocaine est l'une des plus grandes au monde ?", 0, "Noor Ouarzazate", "Solaris", "Helios", "Sahara Sun"));
        questions.add(easy("Quel type de désert couvre une grande partie du sud du Maroc ?", 1, "Gobi", "Sahara", "Kalahari", "Atacama"));
        questions.add(easy("Comment s'appelle le vent chaud venant du désert au Maroc ?", 1, "Mistral", "Chergui", "Tramontane", "Bora"));
        questions.add(new Question("Quelle ville marocaine est connue pour son climat frais et ses cèdres ?", new String[]{"Ifrane", "Laâyoune", "Dakhla", "Essaouira"}, 0, "EASY"));
        questions.add(new Question("Quel oiseau migrateur traverse souvent le détroit de Gibraltar au-dessus du Maroc ?", new String[]{"La cigogne", "Le manchot", "Le kiwi", "Le colibri polaire"}, 0, "EASY"));

        questions.add(medium("Quel courant marin influence fortement les côtes atlantiques marocaines ?", 1, "Gulf Stream", "Courant des Canaries", "El Niño", "Courant du Labrador"));
        questions.add(medium("Dans quelle chaîne de montagnes trouve-t-on de vastes forêts de cèdres ?", 2, "Rif", "Haut Atlas", "Moyen Atlas", "Anti-Atlas"));
        questions.add(medium("Quelle région marocaine est connue pour son fort potentiel éolien ?", 3, "Tadla", "Saïs", "Haouz", "Tanger et Tarfaya"));
        questions.add(medium("Quelle zone du nord du Maroc est considérée comme sismiquement sensible ?", 0, "Al Hoceïma", "Essaouira", "Laâyoune", "Béni Mellal"));
        questions.add(medium("Quel bassin minier est le plus célèbre pour le phosphate marocain ?", 1, "Jerada", "Khouribga", "Touissit", "Midelt"));
        questions.add(medium("Le Maroc investit massivement dans quelles énergies renouvelables ?", 2, "Nucléaire et charbon", "Gaz et pétrole", "Solaire et éolienne", "Hydrogène et bois"));
        questions.add(new Question("Dans quelle région montagneuse du Maroc trouve-t-on de grandes forêts de cèdres ?", new String[]{"Moyen Atlas", "Rif uniquement", "Sahara atlantique", "Plaine du Gharb"}, 0, "MEDIUM"));
        questions.add(new Question("Quelle ville du sud-est marocain est réputée pour ses fossiles et sa géologie désertique ?", new String[]{"Erfoud", "Asilah", "Mohammedia", "Kénitra"}, 0, "MEDIUM"));

        questions.add(hard("Quelle réserve de biosphère de l'UNESCO protège l'arganier ?", 0, "Arganeraie", "Maâmora", "Merdja Zerga", "Aït Bouguemez"));
        questions.add(hard("Quel observatoire astronomique se trouve en altitude près de Marrakech ?", 3, "Michlifen", "Tazekka", "Tidghine", "Oukaïmeden"));
        questions.add(hard("Quel phénomène marin favorise la richesse halieutique au large du Maroc ?", 2, "Marées noires", "Cyclones", "Remontée d'eaux profondes", "Fonte glaciaire"));
        questions.add(new Question("Quelle région marocaine abrite de nombreux gisements fossilifères autour d'Erfoud ?", new String[]{"Oriental", "Souss-Massa", "Drâa-Tafilalet", "Rabat-Salé-Kénitra"}, 2, "HARD"));
    }

    private static void addSportQuestions(ArrayList<Question> questions) {
        questions.add(easy("En quelle année le Maroc a-t-il atteint les demi-finales de la Coupe du monde ?", 1, "2018", "2022", "1986", "1998"));
        questions.add(easy("Quel coureur marocain détient un record mythique du 1500 m ?", 1, "Saïd Aouita", "Hicham El Guerrouj", "Soufiane El Bakkali", "Nezha Bidouane"));
        questions.add(easy("Quel est le surnom de l'équipe nationale du Maroc ?", 1, "Les Aigles", "Les Lions de l'Atlas", "Les Fennecs", "Les Éléphants"));
        questions.add(easy("Qui est la première femme africaine championne olympique en athlétisme ?", 1, "Nezha Bidouane", "Nawal El Moutawakel", "Hasna Benhassi", "Siham Hilali"));
        questions.add(easy("Quel sport traditionnel marocain est aussi appelé fantasia ?", 1, "Lutte", "Tbourida", "Polo", "Pétanque"));
        questions.add(easy("Le Maroc a accueilli la CAN de football en quelle année ?", 0, "1988", "1996", "2008", "2016"));
        questions.add(new Question("Quel club marocain joue traditionnellement en rouge et blanc à Casablanca ?", new String[]{"Wydad AC", "MAS Fès", "FUS Rabat", "IRT Tanger"}, 0, "EASY"));
        questions.add(new Question("Quelle athlète marocaine a remporté l'or olympique du 400 m haies en 1984 ?", new String[]{"Nawal El Moutawakel", "Nezha Bidouane", "Meryem El Hili", "Nadia Ejjafini"}, 0, "EASY"));

        questions.add(medium("Quel champion marocain a remporté l'or olympique du 3000 m steeple en 2021 ?", 2, "Aziz Zakari", "Abdelaati Iguider", "Soufiane El Bakkali", "Youssef Ben Ali"));
        questions.add(medium("Le Maroc a été le premier pays africain à atteindre quel tour du Mondial en 1986 ?", 3, "La finale", "Les quarts", "Les demi-finales", "Les huitièmes"));
        questions.add(medium("Avec quels pays le Maroc coorganisera la Coupe du monde 2030 ?", 0, "Espagne et Portugal", "France et Italie", "Algérie et Tunisie", "Égypte et Grèce"));
        questions.add(medium("Quel entraîneur a mené le Maroc au dernier carré du Mondial 2022 ?", 2, "Vahid Halilhodžić", "Hervé Renard", "Walid Regragui", "Badou Zaki"));
        questions.add(medium("Quel club marocain est réputé pour ses nombreux titres continentaux africains ?", 0, "Raja CA", "Mouloudia Oujda", "COD Meknès", "SCC Mohammédia"));
        questions.add(medium("Dans quelle ville se joue le derby le plus célèbre du football marocain ?", 1, "Rabat", "Casablanca", "Tanger", "Agadir"));
        questions.add(new Question("Quel gardien marocain a particulièrement brillé lors de la Coupe du monde 2022 ?", new String[]{"Yassine Bounou", "Munir El Kajoui", "Brahim Diaz", "Hakim Ziyech"}, 0, "MEDIUM"));
        questions.add(new Question("Quel stade de Casablanca accueille souvent les grands matchs nationaux ?", new String[]{"Stade Adrar", "Stade d'Honneur d'Oujda", "Complexe Mohammed V", "Stade de Berrechid"}, 2, "MEDIUM"));

        questions.add(hard("Quel club marocain a remporté la Coupe de la CAF 2022 ?", 2, "Raja CA", "Wydad AC", "RS Berkane", "FUS Rabat"));
        questions.add(hard("Quelle équipe féminine marocaine a brillé à la Coupe du monde 2023 ?", 1, "Les Lionnes de l'Atlas", "Les Lionnes de l'Atlas", "Les Gazelles rouges", "Les Atlasiques"));
        questions.add(hard("Dans quelles villes s'est jouée la Coupe du monde des clubs 2022 au Maroc ?", 3, "Casablanca et Agadir", "Marrakech et Fès", "Tanger et Casablanca", "Tanger et Rabat"));
        questions.add(new Question("Quel club marocain de l'Oriental a remporté plusieurs Coupes de la CAF au XXIe siècle ?", new String[]{"RS Berkane", "Olympique Khouribga", "CODM Meknès", "Chabab Mohammédia"}, 0, "HARD"));
    }

    private static void addFilmQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quelle ville marocaine abrite les plus grands studios de cinéma ?", 1, "Marrakech", "Ouarzazate", "Casablanca", "Tanger"));
        questions.add(easy("Quel ksar marocain classé par l'UNESCO a servi de décor à de nombreux films ?", 1, "Volubilis", "Aït Ben Haddou", "Chellah", "Bab Mansour"));
        questions.add(easy("Quel film de Ridley Scott a utilisé Aït Ben Haddou comme décor majeur ?", 0, "Gladiator", "Alien", "Blade Runner", "Thelma et Louise"));
        questions.add(easy("Le Festival international du film de Marrakech a lieu dans quelle ville ?", 2, "Rabat", "Casablanca", "Marrakech", "Agadir"));
        questions.add(easy("Quel film avec Brad Pitt a été tourné dans le sud du Maroc ?", 2, "Fight Club", "Seven", "Babel", "Troy"));
        questions.add(easy("Quel acteur joue le rôle principal dans Kingdom of Heaven tourné en partie au Maroc ?", 1, "Russell Crowe", "Orlando Bloom", "Brad Pitt", "Matt Damon"));
        questions.add(new Question("Quel ksar marocain classé UNESCO apparaît aussi dans Gladiator et Game of Thrones ?", new String[]{"Aït Ben Haddou", "Chellah", "Bab Mansour", "Kasbah des Oudayas"}, 0, "EASY"));
        questions.add(new Question("Quel acteur américain joue dans Babel, tourné en partie au Maroc ?", new String[]{"Leonardo DiCaprio", "Brad Pitt", "Matt Damon", "Tom Hanks"}, 1, "EASY"));

        questions.add(medium("Quel réalisateur a tourné Gladiator au Maroc ?", 2, "Christopher Nolan", "James Cameron", "Ridley Scott", "Peter Jackson"));
        questions.add(medium("Quelle ville marocaine sert souvent de base logistique aux tournages du désert ?", 3, "Fès", "Rabat", "Tanger", "Ouarzazate"));
        questions.add(medium("Quel film de la saga Mission Impossible a comporté des scènes tournées à Marrakech ?", 1, "Mission Impossible 3", "Rogue Nation", "Ghost Protocol", "Dead Reckoning"));
        questions.add(medium("Quel film de Bernardo Bertolucci se déroule largement au Maroc ?", 0, "Un thé au Sahara", "Le Dernier Empereur", "1900", "Little Buddha"));
        questions.add(medium("Quel monument marocain apparaît dans de nombreuses productions historiques ?", 2, "Tour Hassan", "Mosquée Hassan II", "Aït Ben Haddou", "Phare d'El Hank"));
        questions.add(medium("Quel genre profite le plus souvent des décors du sud marocain ?", 3, "Comédie romantique", "Film noir", "Documentaire animalier", "Épopée historique"));
        questions.add(new Question("Quel réalisateur a tourné Kingdom of Heaven avec des décors marocains ?", new String[]{"James Cameron", "Ridley Scott", "Luc Besson", "Patty Jenkins"}, 1, "MEDIUM"));
        questions.add(new Question("Quel film de Bernardo Bertolucci a largement utilisé les paysages marocains ?", new String[]{"Un thé au Sahara", "Le Conformiste", "Le Dernier Tango à Paris", "1900"}, 0, "MEDIUM"));

        questions.add(hard("Quel film de la saga James Bond a été tourné en partie à Erfoud et Oujda ?", 1, "Skyfall", "Spectre", "GoldenEye", "Octopussy"));
        questions.add(hard("Quelle ville est souvent surnommée l'Hollywood du Maroc ?", 2, "Casablanca", "Marrakech", "Ouarzazate", "Rabat"));
        questions.add(hard("Quel studio marocain est particulièrement associé aux grosses productions internationales ?", 0, "Atlas Studios", "Pinewood Maroc", "Rif Studios", "Sahara Vision"));
        questions.add(new Question("Quel film de James Bond a utilisé Tanger, Oujda et Erfoud comme décors marocains ?", new String[]{"Skyfall", "Quantum of Solace", "Spectre", "Die Another Day"}, 2, "HARD"));
    }

    private static void addCultureQuestions(ArrayList<Question> questions) {
        questions.add(easy("Qui est le roi actuel du Maroc ?", 1, "Hassan II", "Mohammed VI", "Moulay Ismaïl", "Mohammed V"));
        questions.add(easy("Quelle est la monnaie officielle du Maroc ?", 1, "Dinar", "Dirham", "Euro", "Riyal"));
        questions.add(easy("Quelle langue est officielle au Maroc en plus de l'arabe ?", 1, "Français", "Amazigh", "Espagnol", "Anglais"));
        questions.add(easy("Quel plat est souvent présenté comme emblématique du Maroc ?", 1, "Paëlla", "Couscous", "Pizza", "Sushi"));
        questions.add(easy("De quelle couleur est l'étoile du drapeau marocain ?", 1, "Rouge", "Verte", "Blanche", "Jaune"));
        questions.add(easy("En quelle année le Maroc a-t-il obtenu son indépendance ?", 1, "1945", "1956", "1962", "1975"));
        questions.add(new Question("Quelle boisson traditionnelle accueille souvent les invités au Maroc ?", new String[]{"Thé à la menthe", "Jus de pomme chaud", "Cidre", "Maté glacé"}, 0, "EASY"));
        questions.add(new Question("Quelle ville marocaine est célèbre pour la musique gnawa ?", new String[]{"Essaouira", "Ifrane", "Khouribga", "Béni Mellal"}, 0, "EASY"));

        questions.add(medium("Quelle dynastie règne actuellement sur le Maroc ?", 1, "Mérinide", "Alaouite", "Saadienne", "Almohade"));
        questions.add(medium("Comment s'appelle le vêtement traditionnel à capuche porté au Maroc ?", 1, "Kaftan", "Djellaba", "Tarbouche", "Sarouel"));
        questions.add(medium("Quelle fête marque la fin du Ramadan ?", 1, "Aïd al-Adha", "Aïd al-Fitr", "Achoura", "Mawlid"));
        questions.add(medium("Quelle vallée marocaine est célèbre pour sa fête des roses ?", 0, "Kelâat M'Gouna", "Ourika", "Ziz", "Tafilalet"));
        questions.add(medium("Quelle ville est souvent qualifiée de capitale spirituelle du Maroc ?", 3, "Casablanca", "Rabat", "Tanger", "Fès"));
        questions.add(medium("Quelle musique savante est historiquement liée aux villes impériales marocaines ?", 2, "Chaâbi", "Rap", "Musique andalouse", "Gnawa rock"));
        questions.add(new Question("Quel festival d'Essaouira met à l'honneur la musique gnawa ?", new String[]{"Mawazine", "Festival Gnaoua et Musiques du Monde", "Jazzablanca", "Timitar"}, 1, "MEDIUM"));
        questions.add(new Question("Quel alphabet est utilisé pour écrire officiellement la langue amazighe au Maroc ?", new String[]{"Cyrillique", "Tifinagh", "Runique", "Araméen"}, 1, "MEDIUM"));

        questions.add(hard("Quel Nouvel An amazigh a été récemment officialisé comme jour férié au Maroc ?", 0, "Yennayer", "Achoura", "Mawlid", "Tamkharit"));
        questions.add(hard("Quel monument de Casablanca possède l'un des plus hauts minarets du monde ?", 1, "Tour Hassan", "Mosquée Hassan II", "Koutoubia", "Bab Agnaou"));
        questions.add(hard("Quel type de broderie et de couture rend le caftan marocain célèbre ?", 2, "Broderie japonaise", "Dentelle flamande", "Maallem et sfifa", "Patchwork andin"));
        questions.add(new Question("Quel souverain est souvent considéré comme le père de l'indépendance moderne du Maroc ?", new String[]{"Mohammed V", "Hassan Ier", "Moulay Ismaïl", "Yacoub El Mansour"}, 0, "HARD"));
    }
}
