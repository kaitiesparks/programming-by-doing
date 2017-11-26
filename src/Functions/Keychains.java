package Functions;

import java.util.Scanner;

public class Keychains {

	static int numberKeychains = 0;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		double price = 10.0;
		double salesTax = 0.0825;
		double shippingTax = 5.0;
		double addShipping = 1.0;

		while (choice != 4)
		{
			System.out.println("Ye Olde Keychain Shoppe");
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View current Order");
			System.out.println("4. Checkout");
			System.out.println("Please enter your choice: ");
			choice = keyboard.nextInt();

			if (choice == 1)
			{
				int amount;
				System.out.println("You have " + numberKeychains + " keychains. How many would you like to add?");
				amount = keyboard.nextInt();
				numberKeychains = add(amount);
				System.out.println("You now have " + numberKeychains + " keychains.");
			}
			else if (choice ==2)
			{
				int amount;
				System.out.println("You  have " + numberKeychains + " keychains. How many would you like to remove?");
				amount = keyboard.nextInt();
				numberKeychains = remove(amount);
				System.out.println("You now have " + numberKeychains + " keychains.");
			}
			else if (choice == 3)
			{
				double total;
				System.out.println("You have " + numberKeychains + " keychains.");
				System.out.println("Keychains cost $10 each.");
				total = view(numberKeychains, price, salesTax, shippingTax, addShipping);
				System.out.println("Total amount is $" + total + ".");
			}
			else if (choice == 4)
			{
				String name;
				double total;
				checkout();
				System.out.println("What is your name? ");
				name = keyboard.next();
				System.out.println("You have " + numberKeychains + " keychains.");
				total = view(numberKeychains, price, salesTax, shippingTax, addShipping);
				System.out.println("Keychains cost $10 each.");
				System.out.println("Total amount is $" + total + ".");
				System.out.println("Thank you for your order, " + name + "!");
			}
			else
			{
				System.out.println("INVALID");
			}
			System.out.println();
		}
	}
	public static int add(int amount)
	{
		return numberKeychains + amount;
	}

	public static int remove(int amount)
	{
		if (numberKeychains >= amount)
		{
			return numberKeychains - amount;
		}
		else 
		{
			System.out.println("Invalid amount.");
			return numberKeychains;
		}
	}

	public static double view(int numberKeychains, double price, double salesTax, double shippingTax, double addShipping)
	{
		double beforeTax = numberKeychains * price;
		System.out.println("Subtotal before tax is $" + beforeTax + "0.");
		double shipping = numberKeychains * addShipping + shippingTax;
		System.out.println("Total in shipping is $" + shipping + "0.");
		double tax = (beforeTax + shipping) * salesTax;
		System.out.println("Tax amount is $" + tax + ".");
		return beforeTax + shipping + tax;
		
	}

	public static void checkout()
	{
		System.out.println("CHECKOUT");
	}
}
