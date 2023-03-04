    +-----------+
    |  Gameplay |
    +-----------+
    |           |
    +-----------+
    | +main(String[]) |
    +-----------+
          /_\
           |
           |
    +----------+
    |  Scanner |
    +----------+
    |          |
    +----------+
    | +Scanner() |
    +----------+
          /_\
           |
           |
    +---------+
    |  Random |
    +---------+
    |         |
    +---------+
    | +nextInt(int) |
    +---------+
          /_\
           |
           |
    +--------+
    |  ArrayList<Card> |
    +--------+
    |                |
    +--------+
    | +add(Card) |
    | +get(int): Card |
    | +size(): int |
    | +remove(Object): boolean |
    +--------+
          /_\
           |
           |
    +-----+
    | Card |
    +-----+
    |     |
    +-----+
    | +Card(Rank, Suit) |
    | +getRank(): Rank |
    | +getSuit(): Suit |
    | +toString(): String |
    +-----+
          /_\
           |
           |
    +--------+
    | GenerateHand |
    +--------+
    |            |
    +--------+
    | +populateDeck(ArrayList<Card>) |
    | +populateHand(ArrayList<Card>, ArrayList<Card>, Random) |
    +--------+
