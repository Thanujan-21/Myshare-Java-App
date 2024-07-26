    package Model;

    //sa22522474

    public class MonthlyIncomeReport {

        public static int TotIncome = 0;
        public static int TotExpense = 0;

        public int AddAction(int Amount) {
            TotIncome = TotIncome + Amount;
            return TotIncome;
        }

        public int RemoveAction(int Amount) {
            TotExpense = TotExpense - Amount;
            return TotExpense;
        }
    }