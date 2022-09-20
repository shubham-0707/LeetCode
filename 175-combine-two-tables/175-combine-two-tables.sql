select person.firstName , person.lastName , Address.city , Address.state from person left join Address on Person.personId = Address.personId;  
