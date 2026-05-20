package com.gabbas.quizapp_gabbas.data;

import static com.gabbas.quizapp_gabbas.data.QuestionFactory.easy;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.hard;
import static com.gabbas.quizapp_gabbas.data.QuestionFactory.medium;

import java.util.ArrayList;

public class FesQuestions {

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
        questions.add(easy("Fès est connue pour être la capitale ... du Maroc ?", 1, "Économique", "Spirituelle", "Administrative", "Balnéaire"));
        questions.add(easy("Comment s'appelle la plus ancienne partie de Fès ?", 1, "Fès el-Jdid", "Fès el-Bali", "Ville Nouvelle", "Agdal"));
        questions.add(easy("Quelle université de Fès est considérée comme l'une des plus anciennes du monde ?", 1, "Al Akhawayn", "Al Quaraouiyine", "Sorbonne", "Oxford"));
        questions.add(easy("Dans quelle région se trouve Fès ?", 0, "Fès-Meknès", "Casablanca-Settat", "Rabat-Salé-Kénitra", "Tanger-Tétouan-Al Hoceïma"));
        questions.add(easy("Quelle porte monumentale est le symbole de l'entrée de la médina ?", 1, "Bab Mansour", "Bab Boujloud", "Bab Agnaou", "Bab Doukkala"));
        questions.add(easy("La médina de Fès est-elle principalement piétonne ?", 0, "Oui", "Non", "Seulement le dimanche", "Seulement pour les touristes"));
        questions.add(new Question("Quel jardin public historique offre un espace vert célèbre à Fès ?", new String[]{"Jnan Sbil", "Anfa Park", "Parc Perdicaris", "Jardin Harti"}, 0, "EASY"));
        questions.add(new Question("Quel quartier plus récent de Fès est souvent appelé la Ville Nouvelle ?", new String[]{"Fès el-Bali", "Fès el-Jdid", "Ville Nouvelle", "Mellah"}, 2, "EASY"));

        questions.add(medium("Fès se situe entre quelles unités de relief ?", 0, "Rif et Moyen Atlas", "Rif et Haut Atlas", "Haouz et Gharb", "Anti-Atlas et Sahara"));
        questions.add(medium("Quel oued traverse la ville de Fès ?", 1, "Oued Sebou", "Oued Fès", "Oued Bouregreg", "Oued Ziz"));
        questions.add(medium("Quel quartier de Fès a été fondé par les Mérinides ?", 1, "Fès el-Bali", "Fès el-Jdid", "Ville Nouvelle", "Saïs"));
        questions.add(medium("Fès est célèbre pour son labyrinthe d'environ combien de ruelles ?", 1, "900", "9000", "500", "2000"));
        questions.add(medium("Quelle plaine fertile entoure partiellement Fès ?", 2, "Haouz", "Gharb", "Saïs", "Tadla"));
        questions.add(medium("Quel fort domine la ville au nord ?", 3, "Borj Sud", "Bab El Had", "Kasbah des Oudayas", "Borj Nord"));
        questions.add(new Question("Quelle plaine accueille aussi l'aéroport de Fès-Saïss ?", new String[]{"La Chaouia", "La Saïss", "Le Haouz", "Le Gharb"}, 1, "MEDIUM"));
        questions.add(new Question("Quel jardin historique relie agréablement la médina et les quartiers plus récents de Fès ?", new String[]{"Jnan Sbil", "Jardin Majorelle", "Jardins andalous", "Ménara"}, 0, "MEDIUM"));

        questions.add(hard("Quel quartier de Fès abrite l'un des plus anciens mellahs du Maroc ?", 1, "Ville Nouvelle", "Fès el-Jdid", "Saïs", "Batha"));
        questions.add(hard("Quel mausolée domine l'identité religieuse de la ville ?", 2, "Moulay Abdellah", "Mohammed V", "Moulay Idriss II", "Sidi Abderrahman"));
        questions.add(hard("Quelle enceinte historique sépare l'ancienne médina de quartiers plus récents ?", 0, "Les remparts de Fès", "Le port de Fès", "La corniche", "Le boulevard Hassan II"));
        questions.add(new Question("Quel fort situé au sud fait face à Borj Nord sur les hauteurs de Fès ?", new String[]{"Borj Sud", "Borj de Salé", "Borj El Kebir", "Tour Hassan"}, 0, "HARD"));
    }

    private static void addScienceQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quelle institution de Fès est reconnue par l'UNESCO comme une des plus anciennes universités ?", 1, "Université Sidi Mohamed Ben Abdellah", "Al Quaraouiyine", "Euromed", "Madrasa Bou Inania"));
        questions.add(easy("Quel type de climat caractérise Fès ?", 0, "Méditerranéen à influence continentale", "Désertique", "Tropical", "Polaire"));
        questions.add(easy("Quelle industrie artisanale de Fès utilise des procédés chimiques ancestraux ?", 0, "La tannerie", "La microélectronique", "L'aérospatiale", "La sidérurgie"));
        questions.add(easy("Fès est connue pour son savoir-faire dans quel domaine médical ancien ?", 1, "Chirurgie robotique", "Pharmacopée traditionnelle", "Radiothérapie", "Nanomédecine"));
        questions.add(easy("Quel médecin et philosophe célèbre a vécu à Fès ?", 0, "Maïmonide", "Freud", "Newton", "Pasteur"));
        questions.add(easy("Les horloges à eau médiévales de Fès sont réputées ?", 0, "Vrai", "Faux", "Seulement au Japon", "Uniquement à Marrakech"));
        questions.add(new Question("Quel artisanat de Fès transforme les peaux dans de grands bassins colorés ?", new String[]{"La tannerie", "La plasturgie", "La papeterie", "La fonderie"}, 0, "EASY"));
        questions.add(new Question("Quelle université moderne publique de Fès porte le nom de Sidi Mohamed Ben Abdellah ?", new String[]{"Université Mohammed V", "Université Sidi Mohamed Ben Abdellah", "Université Ibn Zohr", "Université Hassan II"}, 1, "EASY"));

        questions.add(medium("Quel savant a fondé la mosquée-université Al Quaraouiyine ?", 3, "Ibn Khaldoun", "Averroès", "Al Idrissi", "Fatima al-Fihriya"));
        questions.add(medium("L'astrolabe était un instrument étudié à Fès au Moyen Âge ?", 0, "Vrai", "Faux", "Seulement en Andalousie", "Seulement à Rabat"));
        questions.add(medium("Quelle université moderne complète l'offre académique de Fès ?", 0, "Université Sidi Mohamed Ben Abdellah", "Université Mohammed V", "Université Hassan II", "Université Ibn Zohr"));
        questions.add(medium("Quelle spécialité artisanale de Fès est associée à la couleur bleue ?", 2, "Le cuir", "Le métal", "La céramique", "Le bois brut"));
        questions.add(medium("Le système hydraulique de la médina utilise historiquement quoi ?", 1, "Des pipelines marins", "Des canaux et norias", "Des barrages flottants", "Des turbines nucléaires"));
        questions.add(medium("Quel établissement de Fès conserve une bibliothèque historique majeure ?", 0, "Al Quaraouiyine", "Stade de Fès", "Borj Nord", "Bab Boujloud"));
        questions.add(new Question("Quel pigment minéral est souvent associé au bleu célèbre des céramiques de Fès ?", new String[]{"Le soufre", "Le cobalt", "Le cuivre rouge", "Le basalte"}, 1, "MEDIUM"));
        questions.add(new Question("Quel système distribue historiquement l'eau vers les fontaines et ateliers de la médina de Fès ?", new String[]{"Des pipelines marins", "Des canaux dérivés de l'oued Fès", "Des forages pétroliers", "Des barrages alpins"}, 1, "MEDIUM"));

        questions.add(hard("Quel ingrédient naturel est traditionnellement utilisé dans les tanneries de Fès pour assouplir les peaux ?", 2, "Le safran", "Le sel marin", "Les fientes de pigeon", "Le charbon"));
        questions.add(hard("Quel bâtiment médiéval de Fès est associé à un mécanisme d'horloge hydraulique sur sa façade ?", 1, "Borj Nord", "Dar al-Magana", "Palais Bahia", "Kasbah des Oudayas"));
        questions.add(hard("Quel établissement ancien est attribué à Fatima al-Fihriya ?", 0, "Al Quaraouiyine", "Bou Inania", "Nejjarine", "Mellah"));
        questions.add(new Question("Quelle tannerie de Fès est la plus emblématique dans les reportages et documentaires ?", new String[]{"Tannerie Chouara", "Tannerie de Tétouan", "Tannerie de Safi", "Tannerie de Taroudant"}, 0, "HARD"));
    }

    private static void addSportQuestions(ArrayList<Question> questions) {
        questions.add(easy("Quel est le grand club de football de Fès ?", 1, "WAC", "MAS Fès", "Raja", "AS FAR"));
        questions.add(easy("Quel autre club de Fès a évolué au haut niveau ?", 0, "WAF", "IRT", "HUSA", "MAT"));
        questions.add(easy("Comment s'appelle le grand stade de Fès ?", 1, "Stade Mohammed V", "Complexe sportif de Fès", "Stade Adrar", "Stade de Marrakech"));
        questions.add(easy("Les couleurs du Maghreb de Fès sont ?", 1, "Vert et blanc", "Jaune et noir", "Rouge et blanc", "Bleu et blanc"));
        questions.add(easy("En quelle année le MAS a-t-il remporté la Coupe de la CAF ?", 1, "2000", "2011", "2015", "2020"));
        questions.add(easy("Fès a-t-elle déjà accueilli des matchs de l'équipe nationale ?", 0, "Oui", "Non", "Jamais", "Seulement en projet"));
        questions.add(new Question("Quel sport est le plus suivi à Fès ?", new String[]{"Football", "Baseball", "Curling", "Cricket"}, 0, "EASY"));
        questions.add(new Question("Quel autre club de Fès est connu sous l'abréviation WAF ?", new String[]{"Wydad Athletic de Fès", "Wydad Association de France", "Western Atlas Fès", "Wifaq Avenir Fès"}, 0, "EASY"));

        questions.add(medium("Le MAS de Fès possède aussi une grande section de quel sport collectif ?", 1, "Rugby", "Basketball", "Hockey", "Baseball"));
        questions.add(medium("Quel stade historique plus petit existe aussi en ville ?", 0, "Stade Hassan II", "Camp Nou", "San Siro", "Allianz Arena"));
        questions.add(medium("Quel titre continental supplémentaire le MAS a-t-il remporté après la Coupe de la CAF ?", 2, "Ligue des champions", "CHAN", "Supercoupe de la CAF", "Coupe arabe"));
        questions.add(medium("Quel club fassi est abrégé WAF ?", 0, "Wydad Athletic de Fès", "Wissal Association de Fès", "Wifaq Amazigh de Fès", "Wakanda Athletic Fès"));
        questions.add(medium("Quel équipement moderne a servi lors de grandes compétitions internationales à Fès ?", 3, "Le port de Fès", "La médina", "Le jardin Jnan Sbil", "Le complexe sportif de Fès"));
        questions.add(medium("Le public du MAS est réputé pour soutenir quel club ?", 1, "Mouloudia Oujda", "Maghreb de Fès", "Raja Beni Mellal", "FUS Rabat"));
        questions.add(new Question("Quel club de Fès a remporté la Coupe de la CAF en 2011 ?", new String[]{"WAF", "MAS Fès", "FUS Rabat", "Raja CA"}, 1, "MEDIUM"));
        questions.add(new Question("Quel grand complexe accueille les principaux matchs internationaux à Fès ?", new String[]{"Complexe sportif de Fès", "Stade Ibn Battouta", "Complexe Mohammed V", "Stade Moulay Abdellah"}, 0, "MEDIUM"));

        questions.add(hard("En 2011, le MAS a réussi quel doublé continental rare ?", 2, "Ligue des champions et CAN", "Confédération et CHAN", "Coupe de la CAF et Supercoupe CAF", "Coupe arabe et Coupe du monde"));
        questions.add(hard("Quel club de Fès joue traditionnellement en jaune et noir ?", 1, "WAF", "MAS", "Racing Fès", "USF"));
        questions.add(hard("Quelle ville impériale voisine constitue un rival régional naturel pour Fès en sport ?", 2, "Agadir", "Tanger", "Meknès", "Laâyoune"));
        questions.add(new Question("Quel nom complet correspond au sigle MAS de Fès ?", new String[]{"Maghreb Association Sportive de Fès", "Mouloudia Athlétique du Saïss", "Marocains Amis du Sport", "Médina Athlétique Souveraine"}, 0, "HARD"));
    }

    private static void addFilmQuestions(ArrayList<Question> questions) {
        questions.add(easy("Pourquoi Fès attire-t-elle souvent les réalisateurs ?", 1, "Pour ses gratte-ciel", "Pour son décor médiéval authentique", "Pour ses plages", "Pour ses pistes de ski"));
        questions.add(easy("Les ruelles de Fès sont idéales pour quel type de films ?", 1, "Films spatiaux", "Films historiques et d'aventure", "Films polaires", "Films sous-marins"));
        questions.add(easy("Quel lieu de Fès est particulièrement photogénique pour les documentaires ?", 0, "Les tanneries Chouara", "Le port", "La corniche", "Le stade de cricket"));
        questions.add(easy("La porte bleue de Fès est connue sous quel nom ?", 1, "Bab Doukkala", "Bab Boujloud", "Bab El Had", "Bab Agnaou"));
        questions.add(easy("Fès est souvent utilisée pour représenter des villes de quelle époque ?", 2, "Futuristes", "Contemporaines américaines", "Médiévales ou orientales", "Industrielles nordiques"));
        questions.add(easy("Quel élément de la médina donne un fort effet de labyrinthe au cinéma ?", 3, "Les gratte-ciel", "Les canaux marins", "Les pistes cyclables", "Les ruelles étroites"));
        questions.add(new Question("Quel jardin de Fès offre un décor apprécié pour les photos et documentaires ?", new String[]{"Jnan Sbil", "Anfa Park", "Ménara", "Parc de la Ligue arabe"}, 0, "EASY"));
        questions.add(new Question("Quel quartier historique labyrinthique attire les tournages d'époque à Fès ?", new String[]{"Ville Nouvelle", "Fès el-Bali", "Anfa", "Touarga"}, 1, "EASY"));

        questions.add(medium("Quel atout visuel de Fès est recherché par les films d'époque ?", 0, "Ses remparts et ses portes", "Ses stations balnéaires", "Ses barrages", "Ses autoroutes"));
        questions.add(medium("Quelle ambiance la lumière de Fès apporte-t-elle souvent aux films ?", 1, "Une ambiance glaciaire", "Une ambiance chaude et dorée", "Une ambiance tropicale", "Une ambiance industrielle"));
        questions.add(medium("Les tournages à Fès privilégient souvent quel quartier historique ?", 2, "Ville nouvelle", "Saïs", "Fès el-Bali", "Aéroport"));
        questions.add(medium("Quel genre audiovisuel utilise fréquemment Fès pour expliquer les savoir-faire traditionnels ?", 0, "Le documentaire", "Le film catastrophe", "Le film de surf", "Le western spatial"));
        questions.add(medium("Quel site de Fès est souvent filmé pour ses mosaïques et son artisanat ?", 3, "Le stade", "Le port sec", "La gare", "Les médersas"));
        questions.add(medium("Les équipes de tournage recherchent Fès pour quel type d'architecture ?", 1, "Scandinave", "Arabo-andalouse", "Gothique anglaise", "Baroque romaine"));
        questions.add(new Question("Quel musée-fondouk de Fès fournit un décor remarquable pour les reportages sur l'artisanat ?", new String[]{"Nejjarine", "Morocco Mall", "Stade de Fès", "Renaissance"}, 0, "MEDIUM"));
        questions.add(new Question("Quel type de décor Fès offre-t-elle souvent aux productions historiques ?", new String[]{"Des gratte-ciel", "Une médina arabo-andalouse préservée", "Des fjords", "Des stations polaires"}, 1, "MEDIUM"));

        questions.add(hard("Quel artisanat de Fès apparaît souvent dans les plans serrés de films documentaires ?", 2, "La verrerie soufflée", "La facture de guitares", "La céramique et le cuir", "La construction navale"));
        questions.add(hard("Quel musée-fondouk de Fès met en valeur le travail du bois et peut intéresser les tournages culturels ?", 0, "Nejjarine", "Batha de Rabat", "Borj Nord TV", "Renaissance"));
        questions.add(hard("Quel bâtiment religieux et intellectuel de Fès peut servir de référence cinématographique au savoir médiéval ?", 1, "Chellah", "Al Quaraouiyine", "Tour Hassan", "Kasbah d'Agadir"));
        questions.add(new Question("Quelle tannerie de Fès est la plus connue à l'image dans les documentaires ?", new String[]{"Chouara", "Bab Boujloud", "Borj Nord", "Jnan Sbil"}, 0, "HARD"));
    }

    private static void addCultureQuestions(ArrayList<Question> questions) {
        questions.add(easy("Qui a fondé la ville de Fès selon la tradition idrisside ?", 0, "Moulay Idriss Ier et Idriss II", "Yacoub El Mansour", "Moulay Ismaïl", "Hassan II"));
        questions.add(easy("Quel chapeau traditionnel porte le nom de la ville ?", 1, "Sombrero", "Fès (tarbouche)", "Béret", "Panama"));
        questions.add(easy("Quelle spécialité culinaire sucrée-salée de Fès est très célèbre ?", 1, "Couscous", "Pastilla au pigeon", "Tanjia", "Harira"));
        questions.add(easy("Comment s'appelle le quartier des tanneurs à Fès ?", 0, "Chouara", "Gueliz", "Habous", "Marina"));
        questions.add(easy("Quelle médersa est célèbre pour son architecture mérinide à Fès ?", 0, "Bou Inania", "Ben Youssef", "Tinmel", "Ménara"));
        questions.add(easy("Fès est inscrite au patrimoine mondial de l'UNESCO depuis ?", 0, "1981", "1995", "2001", "2010"));
        questions.add(new Question("Quel jardin historique est très populaire à Fès pour se promener ?", new String[]{"Jnan Sbil", "Ménara", "Jardin Harti", "Parc Hassan II"}, 0, "EASY"));
        questions.add(new Question("Quel quartier royal de Fès abrite le palais et un ancien mellah ?", new String[]{"Fès el-Jdid", "Ville Nouvelle", "Saïss", "Aïn Chock"}, 0, "EASY"));

        questions.add(medium("Le bleu de Fès est surtout associé à quel artisanat ?", 1, "Tissage", "Céramique", "Armurerie", "Bijouterie"));
        questions.add(medium("Le quartier des Andalous a été fondé par des réfugiés venus de ?", 0, "Cordoue", "Rome", "Athènes", "Le Caire"));
        questions.add(medium("Qui a fondé l'université Al Quaraouiyine ?", 2, "Aïcha Kandicha", "Lalla Salma", "Fatima al-Fihriya", "Zaynab Nafzawiya"));
        questions.add(medium("Quel quartier de Fès abrite un mellah historique ?", 1, "Saïs", "Fès el-Jdid", "Ras Jnane", "Bensouda"));
        questions.add(medium("Quel musée de Fès est installé dans un ancien palais et expose les arts traditionnels ?", 0, "Musée Batha", "Musée Mohammed VI de Rabat", "Villa des Arts", "Musée du Judaïsme Marocain"));
        questions.add(medium("Quel type de musique savante est fortement présent à Fès ?", 2, "Jazz new-yorkais", "Flamenco andalou", "Musique andalouse", "Techno minimale"));
        questions.add(new Question("Quel festival de Fès est dédié aux musiques sacrées du monde ?", new String[]{"Festival Gnaoua", "Festival des Musiques Sacrées du Monde", "Mawazine", "Jazzablanca"}, 1, "MEDIUM"));
        questions.add(new Question("Quel musée-fondouk de Fès présente les arts du bois et de l'artisanat ?", new String[]{"Nejjarine", "American Legation", "Bab Rouah", "Dar al-Makhzen"}, 0, "MEDIUM"));

        questions.add(hard("Quel saint patron et souverain est particulièrement lié à Fès ?", 1, "Moulay Abdellah", "Moulay Idriss II", "Mohammed V", "Sidi Kaouki"));
        questions.add(hard("Quel bâtiment de Fès est surnommé la maison de l'horloge ?", 0, "Dar al-Magana", "Borj Nord", "Dar Si Saïd", "Bab Mansour"));
        questions.add(hard("Quel fondouk-musée de Fès est spécialisé dans les arts du bois ?", 2, "Batha", "Bou Inania", "Nejjarine", "Dar Belghazi"));
        questions.add(new Question("Quel fondateur idrisside est particulièrement associé à l'essor de Fès au IXe siècle ?", new String[]{"Idriss II", "Youssef ben Tachfine", "Ahmed al-Mansour", "Moulay Ismaïl"}, 0, "HARD"));
    }
}
