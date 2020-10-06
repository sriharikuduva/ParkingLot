# ParkingLot

### System Requirements

        We will focus on the following set of requirements while designing the metadata.Library Management System:

        1) Any library member should be able to search books by their title, author, subject category as well by the publication date.

        2) Each book will have a unique identification number and other details including a rack number which will help to physically locate the book.

        3) There could be more than one copy of a book, and library members should be able to check-out and reserve any copy. We will call each copy of a book, a book item.

        4) The system should be able to retrieve information like who took a particular book or what are the books checked-out by a specific library member.

        5) There should be a maximum limit (5) on how many books a member can check-out.

        6) There should be a maximum limit (10) on how many days a member can keep a book.

        7) The system should be able to collect fines for books returned after the due date.

        8) Members should be able to reserve books that are not currently available.

        9) The system should be able to send notifications whenever the reserved books become available, as well as when the book is not returned within the due date.

        10) Each book and member card will have a unique barcode. The system will be able to read barcodes from books and members’ library cards.


### Actors

        Admin: Mainly responsible for adding and modifying parking floors, parking spots, entrance, and exit panels, adding/removing parking attendants, etc.

        Customer: All customers can get a parking ticket and pay for it.

        Parking attendant: Parking attendants can do all the activities on the customer’s behalf, and can take cash for ticket payment.

        System: To display messages on different info panels, as well as assigning and removing a vehicle from a parking spot.

### Use Cases

        Add/Remove/Edit parking floor: To add, remove or modify a parking floor from the system. Each floor can have its own display board to show free parking spots.

        Add/Remove/Edit parking spot: To add, remove or modify a parking spot on a parking floor.

        Add/Remove a parking attendant: To add or remove a parking attendant from the system.

        Take ticket: To provide customers with a new parking ticket when entering the parking lot.

        Scan ticket: To scan a ticket to find out the total charge.

        Credit card payment: To pay the ticket fee with credit card.

        Cash payment: To pay the parking ticket through cash.

        Add/Modify parking rate: To allow admin to add or modify the hourly parking rate.
