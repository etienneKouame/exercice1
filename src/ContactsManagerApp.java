public class ContactsManagerApp {
    // Représente un contact (comme une fiche avec un nom et un numéro)
    static class Contact {
        String Name;
        String Number;
    }

    // Gère une liste de contacts (carnet d'adresses)
     static class ContactsManager {
        Contact[] myFriend;
        int FriendsCount;

        // Constructeur : initialise le tableau et le compteur
         public ContactsManager(){
             FriendsCount = 0;
             myFriend = new Contact[500];
         }
         //Ajoute un contact au tableau
         public void addContact(Contact contact){
             myFriend[FriendsCount] = contact;
             FriendsCount++;
         }
         //Recherche d'un contact par son nom
         public String searchContact(String Name){
             for (int i=0 ;i < FriendsCount ;i++){
                 if(myFriend[i].Name.equals(Name)){
                     return myFriend[i].Number ;  //Retourne le numéro trouvé
                 }
             }
             return null ;
         }
     }

     public static void main(String[] args){
        ContactsManager myContactsManager = new ContactsManager();// On crée un gestionnaire de contacts

        Contact contact1 = new Contact();//Ajout d'un contact
        contact1.Name = "etienne";
        contact1.Number = "0779573600";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.Name = "sara";
        contact2.Number = "0102030405";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.Name = "daniel";
        contact3.Number = "0708541203";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.Name = "miler";
        contact4.Number = "0555344520";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.Name = "astrid";
        contact5.Number = "0727144531";
        myContactsManager.addContact(contact5);

        //Recherche d'un contact par son nom
        String searchName = "astrid";
        String phone = myContactsManager.searchContact(searchName);
        System.out.println("Numéros de" + searchName + " : " + phone);
     }
}
