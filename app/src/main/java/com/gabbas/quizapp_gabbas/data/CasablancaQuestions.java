package com.gabbas.quizapp_gabbas.data;

import static com.gabbas.quizapp_gabbas.data.QuestionFactory.easy;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.hard;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.medium;

import java.util.ArrayList;

public class CasablancaQuestions {

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
        questions.add(easy("Quelle est la plus grande ville du Maroc ?", 2, "Rabat", "Marrakech", "Casablanca", "Tanger"));
        questions.add(easy("Quelle ville marocaine est connue comme la capitale économique ?", 1, "Fès", "Casablanca", "Agadir", "Oujda"));
        questions.add(easy("Quel océan borde Casablanca ?", 2, "Indien", "Pacifique", "Atlantique", "Arctique"));
        questions.add(easy("Quelle grande mosquée se trouve à Casablanca ?", 1, "Koutoubia", "Hassan II", "Tour Hassan", "Al Quaraouiyine"));
        questions.add(easy("Casablanca se trouve dans quel pays ?", 2, "Tunisie", "Algérie", "Maroc", "Égypte"));
        questions.add(easy("Dans quelle région se situe Casablanca ?", 1, "Rabat-Salé-Kénitra", "Casablanca-Settat", "Fès-Meknès", "Souss-Massa"));
        questions.add(new Question("Quel quartier côtier de Casablanca est célèbre pour sa plage et ses cafés ?", new String[]{"Maarif", "Aïn Diab", "Sidi Moumen", "Derb Sultan"}, 1, "EASY"));
        questions.add(new Question("Quel grand centre commercial se trouve sur la corniche de Casablanca ?", new String[]{"Borj Fès", "Mazar", "Morocco Mall", "Tanger City Mall"}, 2, "EASY"));

        questions.add(medium("Quel est l'ancien nom de Casablanca ?", 0, "Anfa", "Mazagan", "Tingis", "Sala"));
        questions.add(medium("Quel climat domine à Casablanca ?", 1, "Désertique", "Méditerranéen", "Tropical", "Polaire"));
        questions.add(medium("Casablanca est située sur quel plateau ?", 2, "Saïs", "Haouz", "Chaouia", "Gharb"));
        questions.add(medium("Quel quartier balnéaire de Casablanca est célèbre pour sa Corniche ?", 1, "Derb Sultan", "Aïn Diab", "Habous", "Sbata"));
        questions.add(medium("Quel grand aéroport dessert principalement Casablanca ?", 0, "Mohammed V", "Rabat-Salé", "Ménara", "Ibn Battouta"));
        questions.add(medium("Quelle ville côtière se trouve au nord de Casablanca ?", 3, "El Jadida", "Settat", "Benslimane", "Mohammedia"));
        questions.add(new Question("Quelle grande gare ferroviaire accueille de nombreux trains nationaux à Casablanca ?", new String[]{"Casa-Port", "Casa-Oasis", "Casa-Sud", "Casa-Voyageurs"}, 3, "MEDIUM"));
        questions.add(new Question("Quel ancien aérodrome a laissé son nom à un vaste quartier moderne de Casablanca ?", new String[]{"Médiouna", "Anfa", "Ben M'Sik", "Sidi Bernoussi"}, 1, "MEDIUM"));

        questions.add(hard("Dans quelle province se situe l'aéroport Mohammed V ?", 2, "Médiouna", "Benslimane", "Nouaceur", "Settat"));
        questions.add(hard("Quel sanctuaire côtier est célèbre au large de la Corniche de Casablanca ?", 1, "Sidi Harazem", "Sidi Abderrahman", "Moulay Idriss", "Sidi Ifni"));
        questions.add(hard("Le port de Casablanca compte parmi les plus importants de quel continent ?", 0, "Afrique", "Europe", "Asie", "Amérique du Sud"));
        questions.add(new Question("Quel phare emblématique domine la côte casablancaise près de la corniche ?", new String[]{"Phare du Cap Spartel", "Phare d'El Hank", "Phare de Rabat", "Phare de Tarfaya"}, 1, "HARD"));
    }

    private static void addScienceQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel climat domine à Casablanca ?", 2, "Désertique", "Tropical", "Méditerranéen", "Polaire"));
        questions.add(easy("Casablanca utilise quelle ressource en eau majeure dans son réseau ?", 1, "Le Nil", "Oum Er-Rbia", "L'Amazone", "Le Rhin"));
        questions.add(easy("La mosquée Hassan II est bâtie en partie sur l'eau ?", 0, "Oui", "Non", "Dans le désert", "Sur une montagne"));
        questions.add(easy("Quelle université publique importante est basée à Casablanca ?", 2, "Université Mohammed V", "Université Cadi Ayyad", "Université Hassan II", "Université Al Akhawayn"));
        questions.add(easy("Casablanca possède-t-elle un tramway électrique ?", 0, "Oui", "Non", "En projet seulement", "Seulement un métro"));
        questions.add(easy("Quelle activité domine dans l'économie de Casablanca ?", 1, "Agriculture de montagne", "Industrie et services", "Extraction minière", "Foresterie"));
        questions.add(new Question("Quel transport urbain électrique circule sur rails à Casablanca ?", new String[]{"Bus à vapeur", "Tramway", "Téléphérique", "Monorail"}, 1, "EASY"));
        questions.add(new Question("Quel grand CHU de Casablanca porte le nom d'un philosophe andalou ?", new String[]{"CHU Ibn Sina", "CHU Avicenne", "CHU Ibn Rochd", "CHU Al Idrissi"}, 2, "EASY"));

        questions.add(medium("Quel port gère une grande part du commerce marocain historique ?", 1, "Port d'Agadir", "Port de Casablanca", "Port de Larache", "Port de Safi"));
        questions.add(medium("Quel hub d'innovation et de start-up est bien connu à Casablanca ?", 2, "MASCIR", "Cité des sciences", "Technopark", "Green Energy Lab"));
        questions.add(medium("Quelle influence maritime modère les températures de Casablanca ?", 3, "Mer Rouge", "Méditerranée", "Rivière Sebou", "Océan Atlantique"));
        questions.add(medium("Quel aéroport situé au sud de la ville accueille l'essentiel du trafic international ?", 0, "Mohammed V", "Boukhalef", "Ménara", "Rabat-Salé"));
        questions.add(medium("Le minaret de la mosquée Hassan II culmine à environ quelle hauteur ?", 2, "120 m", "160 m", "210 m", "300 m"));
        questions.add(medium("Quelle zone proche de l'aéroport est connue pour son activité aéronautique ?", 1, "Maarif Hub", "Midparc", "Bouregreg Tech", "Casa Marina"));
        questions.add(new Question("Quel quartier accueille la faculté des sciences Aïn Chock à Casablanca ?", new String[]{"Aïn Chock", "Bourgogne", "Sidi Belyout", "Derb Ghallef"}, 0, "MEDIUM"));
        questions.add(new Question("Quel effet de l'océan Atlantique aide à modérer les températures de Casablanca ?", new String[]{"Le foehn saharien", "La mousson", "La brise océanique", "Le gel continental"}, 2, "MEDIUM"));

        questions.add(hard("Dans quel quartier se trouve le Technopark historique de Casablanca ?", 3, "Aïn Sebaâ", "Habous", "Bourgogne", "Sidi Maârouf"));
        questions.add(hard("Le cluster aéronautique Midparc se situe près de quelle commune ?", 0, "Nouaceur", "Mohammedia", "Médiouna", "Azemmour"));
        questions.add(hard("Quel type de structure domine l'architecture ancienne de Casablanca au niveau des matériaux ?", 2, "Bois et verre", "Acier", "Pierre et béton armé", "Glace"));
        questions.add(new Question("Quelle commune au sud de Casablanca concentre l'aéroport Mohammed V et plusieurs zones industrielles ?", new String[]{"Tit Mellil", "Bouskoura", "Nouaceur", "Azemmour"}, 2, "HARD"));
    }

    private static void addSportQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel club célèbre est basé à Casablanca ?", 0, "Raja CA", "AS FAR", "FUS Rabat", "IRT Tanger"));
        questions.add(easy("Quel autre grand club de football est basé à Casablanca ?", 1, "MAS Fès", "Wydad AC", "HUSA Agadir", "MAT Tétouan"));
        questions.add(easy("Dans quelle ville se trouve le Complexe Mohammed V ?", 2, "Rabat", "Marrakech", "Casablanca", "Fès"));
        questions.add(easy("Casablanca est connue pour quel derby ?", 1, "Derby de Madrid", "Derby de Casablanca", "Derby de Milan", "Derby du Caire"));
        questions.add(easy("Quel sport est le plus populaire à Casablanca ?", 2, "Tennis", "Basketball", "Football", "Handball"));
        questions.add(easy("Quelles sont les couleurs du Raja CA ?", 1, "Rouge et blanc", "Vert et blanc", "Bleu et blanc", "Jaune et noir"));
        questions.add(new Question("Dans quel sport s'affrontent le Raja et le Wydad lors du derby de Casablanca ?", new String[]{"Basketball", "Rugby", "Football", "Handball"}, 2, "EASY"));
        questions.add(new Question("Quel stade emblématique accueille traditionnellement le derby de Casablanca ?", new String[]{"Stade Ibn Battouta", "Complexe Mohammed V", "Stade Moulay Abdellah", "Stade Adrar"}, 1, "EASY"));

        questions.add(medium("Quelles sont les couleurs du Wydad AC ?", 0, "Rouge et blanc", "Vert et blanc", "Bleu et blanc", "Noir et blanc"));
        questions.add(medium("Quel quartier de Casablanca abrite le complexe Mohammed V ?", 0, "Maârif", "Anfa", "Oasis", "Hay Mohammadi"));
        questions.add(medium("Quel club de Casablanca a remporté la Ligue des champions de la CAF en 2022 ?", 1, "Raja CA", "Wydad AC", "TAS", "Racing Casa"));
        questions.add(medium("Le Raja de Casablanca est souvent surnommé le club du ... ?", 0, "Peuple", "Roi", "Nord", "Désert"));
        questions.add(medium("Quel club casablancais a remporté la Coupe de la CAF en 2021 ?", 0, "Raja CA", "Wydad AC", "SCCM", "Racing Casa"));
        questions.add(medium("Le derby de Casablanca oppose quels deux clubs ?", 3, "Raja et FUS", "Wydad et AS FAR", "Raja et MAT", "Raja et Wydad"));
        questions.add(new Question("Le WAC est l'abréviation de quel club casablancais ?", new String[]{"Wydad Athletic Club", "Wifaq Atlas Club", "Western Athletic Club", "Wydad Association Casa"}, 0, "MEDIUM"));
        questions.add(new Question("Le RCA est l'abréviation de quel grand club de Casablanca ?", new String[]{"Racing Club Anfa", "Rabat Club Atlas", "Raja Club Athletic", "Royal Casablanca Association"}, 2, "MEDIUM"));

        questions.add(hard("Quel groupe ultra est historiquement associé au Raja CA ?", 1, "Winners", "Green Boys", "Ultras Hercules", "Helala Boys"));
        questions.add(hard("Quel groupe ultra est historiquement associé au Wydad AC ?", 0, "Winners", "Green Boys", "Cap Soleil", "Reds North"));
        questions.add(hard("Quel club casablancais a remporté la Ligue des champions africaine en 2017 puis en 2022 ?", 2, "Raja CA", "SCCM", "Wydad AC", "Racing Casa"));
        questions.add(new Question("Quel club casablancais a atteint la finale de la Coupe du monde des clubs en 2013 ?", new String[]{"Wydad AC", "Raja CA", "Racing Casa", "TAS Casablanca"}, 1, "HARD"));
    }

    private static void addFilmQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel film hollywoodien célèbre porte le nom de Casablanca ?", 2, "Titanic", "Avatar", "Casablanca", "Inception"));
        questions.add(easy("Où a été tourné l'essentiel du film Casablanca de 1942 ?", 1, "Au Maroc", "À Hollywood", "À Londres", "À Paris"));
        questions.add(easy("Qui est l'acteur principal du film Casablanca ?", 1, "Brad Pitt", "Humphrey Bogart", "Tom Cruise", "Clark Gable"));
        questions.add(easy("Quelle actrice joue Ilsa Lund dans Casablanca ?", 0, "Ingrid Bergman", "Audrey Hepburn", "Grace Kelly", "Lauren Bacall"));
        questions.add(easy("Comment s'appelle le café célèbre inspiré du film à Casablanca ?", 1, "Café Hafa", "Rick's Café", "Café de Flore", "Le Bistrot du Port"));
        questions.add(easy("En quelle année est sorti le film Casablanca ?", 1, "1930", "1942", "1956", "1960"));
        questions.add(new Question("Dans quelle ville est censée se dérouler l'intrigue du film Casablanca ?", new String[]{"Marrakech", "Tanger", "Casablanca", "Rabat"}, 2, "EASY"));
        questions.add(new Question("Quel lieu de Casablanca recrée l'ambiance du café de Rick pour les visiteurs ?", new String[]{"Le Colisée", "Rick's Café", "Le Grand Socco", "Le Port Center"}, 1, "EASY"));

        questions.add(medium("Quelle chanson célèbre est jouée dans le film Casablanca ?", 1, "Imagine", "As Time Goes By", "Yesterday", "My Way"));
        questions.add(medium("Quel réalisateur a dirigé le film Casablanca ?", 1, "Steven Spielberg", "Michael Curtiz", "Alfred Hitchcock", "James Cameron"));
        questions.add(medium("Le film Casablanca a-t-il remporté l'Oscar du meilleur film ?", 0, "Oui", "Non", "Il a seulement été nommé", "Non, il a été interdit"));
        questions.add(medium("Comment s'appelle le personnage joué par Humphrey Bogart ?", 2, "Victor Laszlo", "Louis Renault", "Rick Blaine", "Sam"));
        questions.add(medium("Quel studio hollywoodien a produit le film Casablanca ?", 3, "Paramount", "MGM", "Universal", "Warner Bros."));
        questions.add(medium("Dans quel contexte historique se déroule le film Casablanca ?", 0, "Seconde Guerre mondiale", "Première Guerre mondiale", "Guerre froide", "Révolution française"));
        questions.add(new Question("Quel pianiste et chanteur du film joue la chanson As Time Goes By ?", new String[]{"Rick", "Renault", "Sam", "Ugarte"}, 2, "MEDIUM"));
        questions.add(new Question("Quel acteur interprète Victor Laszlo dans le film Casablanca ?", new String[]{"Claude Rains", "Peter Lorre", "Paul Henreid", "Humphrey Bogart"}, 2, "MEDIUM"));

        questions.add(hard("Comment s'appelle le mari d'Ilsa Lund dans le film Casablanca ?", 1, "Ugarte", "Victor Laszlo", "Sam", "Major Strasser"));
        questions.add(hard("Quel acteur incarne le capitaine Louis Renault ?", 2, "Peter Lorre", "Paul Henreid", "Claude Rains", "Sydney Greenstreet"));
        questions.add(hard("Quelle image finale du film est devenue emblématique ?", 0, "Rick et Renault marchant dans le brouillard", "Une scène de plage", "Le port au coucher du soleil", "Une foule à la médina"));
        questions.add(new Question("Quel acteur joue le personnage d'Ugarte dans le film Casablanca ?", new String[]{"Sydney Greenstreet", "Peter Lorre", "Dooley Wilson", "Conrad Veidt"}, 1, "HARD"));
    }

    private static void addCultureQuestions(ArrayList<Question> questions) {
        questions.add(easy("Casablanca est connue comme quelle capitale du Maroc ?", 2, "Administrative", "Culturelle", "Économique", "Spirituelle"));
        questions.add(easy("Quelle mosquée est un symbole de Casablanca ?", 0, "Hassan II", "Koutoubia", "Tinmel", "Al Quaraouiyine"));
        questions.add(easy("Casablanca est une ville côtière : vrai ou faux ?", 0, "Vrai", "Faux", "Seulement l'hiver", "Seulement l'été"));
        questions.add(easy("Quelle est la monnaie utilisée à Casablanca ?", 2, "Euro", "Dollar", "Dirham", "Dinar"));
        questions.add(easy("Quelle promenade au bord de l'eau est très célèbre à Casablanca ?", 1, "Le Bouregreg", "La Corniche", "Les Oudayas", "Le Mellah"));
        questions.add(easy("Quel quartier est connu comme la nouvelle médina de Casablanca ?", 2, "Maârif", "Sidi Belyout", "Habous", "Anfa supérieur"));
        questions.add(new Question("Quelle grande place administrative du centre-ville porte le nom d'un roi marocain ?", new String[]{"Place Jamaa", "Place des Martyrs", "Place Mohammed V", "Place du 16 Novembre"}, 2, "EASY"));
        questions.add(new Question("Quel quartier commerçant moderne de Casablanca est célèbre pour ses boutiques et cafés ?", new String[]{"Maarif", "Chellah", "Touarga", "Médina de Salé"}, 0, "EASY"));

        questions.add(medium("Quel monument de Casablanca possède un minaret de 210 mètres ?", 1, "Cathédrale du Sacré-Cœur", "Mosquée Hassan II", "Twin Center", "Villa des Arts"));
        questions.add(medium("Quel centre commercial géant est un symbole de la Casablanca moderne ?", 0, "Morocco Mall", "Borj Fès", "Mazar", "Bab El Bahr"));
        questions.add(medium("Quel ensemble de tours a longtemps symbolisé le centre d'affaires de la ville ?", 2, "Tour Mohammed VI", "CFC Towers", "Twin Center", "Borj Al Arab"));
        questions.add(medium("Quelle ancienne cathédrale art déco est connue au centre-ville ?", 3, "Saint-Pierre", "Notre-Dame de la Paix", "Saint-Michel", "Sacré-Cœur"));
        questions.add(medium("Quel style architectural marque fortement le centre de Casablanca ?", 1, "Baroque", "Art déco", "Gothique", "Roman"));
        questions.add(medium("Quelle institution culturelle expose de l'art contemporain à Casablanca ?", 0, "Villa des Arts", "Dar Si Saïd", "Musée Batha", "Musée Nejjarine"));
        questions.add(new Question("Quel marché du centre-ville est un repère culinaire et architectural de Casablanca ?", new String[]{"Marché Central", "Souk El Had", "Kissariat El Kifah", "Marché Bab Marrakech"}, 0, "MEDIUM"));
        questions.add(new Question("Quel ancien site industriel de Casablanca est devenu un espace culturel alternatif ?", new String[]{"Ancien arsenal du port", "Les Anciens Abattoirs", "La base navale", "Le dépôt ferroviaire colonial"}, 1, "MEDIUM"));

        questions.add(hard("Quel musée de Casablanca est présenté comme unique dans le monde arabe par son thème ?", 1, "Musée du Football", "Musée du Judaïsme Marocain", "Musée des Oudayas", "Musée Batha"));
        questions.add(hard("Quel quartier central porte le nom de l'ancien consul français Louis Hubert Lyautey dans l'histoire urbaine ?", 3, "Habous", "Aïn Sebaâ", "Derb Sultan", "Sidi Belyout"));
        questions.add(hard("Quel nouveau quartier financier international s'est développé au sud-ouest de Casablanca ?", 0, "Casablanca Finance City", "Bouregreg Valley", "Marina Smir", "Technopolis Rabat"));
        questions.add(new Question("Quel parc urbain moderne a été aménagé sur l'ancien site de l'aérodrome d'Anfa ?", new String[]{"Jnan Sbil", "Anfa Park", "Parc Perdicaris", "Parc Lalla Hasna"}, 1, "HARD"));
    }
}
