package com.codewell.mk.randomperson;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RandomPersonGeneratorActivity extends Activity {
    /** Called when the activity is first created. */

	int backgroundImage=R.drawable.b5;
	int hair=R.drawable.kosa_maska_1;
	int clothes=R.drawable.obleka_obicna;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		TextView tv = (TextView )findViewById(R.id.StartText);
		tv.setText(getRandomText());
		((ImageView) findViewById(R.id.BackgroundImage)).setImageResource(backgroundImage);
		((ImageView) findViewById(R.id.HairImage)).setImageResource(hair);
		((ImageView) findViewById(R.id.ClothesImage)).setImageResource(clothes);
		
		
	}
	public  String getRandomText() {

		String[] iminja_maski = { "Тошо", "Ставре", "Орце", "Симе", "Диме",
				"Кољо", "Божо", "Збратимир", "Шефкет", "Станко", "Јанко",
				"Мехмед", "Мерсел", "Валдет" };
		String[] iminja_zenski = { "Ана", "Срцка", "Мила", "Љубинка",
				"Александра", "Убавка", "Лепа", "Дудија", "Јана", "Вера",
				"Станка", "Валбона" };
		String[] mesta = { "Скопје-Центар", "Скопје-Ново Лисиче",
				"Скопје-Капиштец", "Велес", "Струмица",
				"Битола", "Штип", "Тетово", "Гостивар", "Љубојно", "Брајчино",
				"Миравци", "Црвени брегови", "Росоман", "Каласлари", "Чашка",
				"Богомила" };
		int[] mestaSliki={R.drawable.b5,R.drawable.b3,R.drawable.b5,R.drawable.b1,R.drawable.b3,R.drawable.b7,R.drawable.b1,R.drawable.b8,R.drawable.b6,R.drawable.b3,R.drawable.b2,R.drawable.b1,R.drawable.b4,R.drawable.b4,R.drawable.b7,R.drawable.b6,R.drawable.b9,R.drawable.b5,R.drawable.b5,R.drawable.b5,R.drawable.b5,R.drawable.b5,R.drawable.b5,R.drawable.b5,R.drawable.b5,R.drawable.b5};
		int[] godini = { 3, 5, 10, 16, 21, 28, 36, 45, 55, 67, 75 };
		String[] pomali_od_5_sakam = { "цртам", "играм со играчки",
				"гледам цртани", "си играм со кукли", "си играм со деца",
				"ги тепам децата" };
		String[] pomali_od_5_crtan = { "Спајдермен", "Супермен", "Ајс Ејџ",
				"Мечето Ушко", "Том и Џери", "Сунѓерот Боб", "Ноди" };
		String[] od_10_do_55_hobi = { "баскет", "фудбал", "тенис", "голф",
				"плејстејшн" };
		String[] od_16_do_36_hobi = { "свирам у бенд", "се излежавам",
				"идам по журки", "не пропуштам театар" };
		String[] od_21_do_55_rabota = { "земјоделец", "претприемач",
				"јавен службеник", "неработник", "стечаец - што и да е",
				"инженер", "доктор", "адвокат", "ѕидар", "тишлер",
				"камионџија", "келнер" };
		int[] 	rabotaMapa = { R.drawable.obleka_farmer,R.drawable.obleka_advokat,
				R.drawable.obleka_advokat, R.drawable.obleka_obicna, R.drawable.obleka_obicna,
				R.drawable.obleka_advokat, R.drawable.obleka_advokat,R.drawable.obleka_advokat, R.drawable.obleka_farmer, R.drawable.obleka_farmer,
				R.drawable.obleka_obicna,R.drawable.obleka_obicna };
		String[] od_21_do_55_hobi = { "читам книги", "играм спортска",
				"бегам од дома", "се швалерисуем", "штрикам" };
		String[] nad_55 = { "пазам на здравјето", "пазам на исхраната",
				"штедам", "гледам внучиња", "уживам во слободно време",
				"идам во парк", "се возам со автобус во Вторник" };
//		String[] losho_mashko = { "ја нервирам жена ми", "се опивам по кафани",
//				"пецам" };
//		String[] losho_zensko = { "го трујам мажот ми", "киснам на телефон",
//				"се расправам со децата" };
		
		String result = "Јас се викам ";
		Random r = new Random();
		int easter=r.nextInt(10);
		if (easter==0){
			String[] east = {"Јас се викам Добромир. Имам 203 години и вампир сум уште од мали нозе.", "Јас се викам Кики имам 5 години, пекинезер сум и омилено ми е да ги гризам папучите на газдата.", "Не знам колку години имам, заборавив што ме прашаше, а оваа бабава шо мрчи слободно носи ми ја оттука. А чиј беше ти синко?"};
			int koj=r.nextInt(east.length);
			if (koj==0){
				clothes=R.drawable.obleka_vampir;
			}
			if (koj==1){
				clothes=R.drawable.obleka_dete;
				hair= R.drawable.kosa_zenska_1;
			}
			if (koj==2){
				clothes=R.drawable.obleka_penz;
				hair= R.drawable.kosa_maska_penz;
			}
			return east[koj];

		}
		int pol = r.nextInt(2);
		if (pol == 0) {
			
			int broj = r.nextInt(iminja_maski.length);
			result += iminja_maski[broj];
		} else {
			hair=R.drawable.kosa_zenska_1;
			int broj = r.nextInt(iminja_zenski.length);
			result += iminja_zenski[broj];
		}
		result += ", живеам во ";
		int mesto=r.nextInt(mesta.length);
		result += mesta[mesto];
		backgroundImage=mestaSliki[mesto];
		int god = godini[r.nextInt(godini.length)];
		result += " и имам ";
		result += god;
		result += " години. ";
		if (god <= 5) {
			result += "Многу сакам да ";
			result += pomali_od_5_sakam[r.nextInt(pomali_od_5_sakam.length)];
			result += " и мојот омилен цртан филм е ";
			result += pomali_od_5_crtan[r.nextInt(pomali_od_5_crtan.length)];
			result += ".";
			clothes=R.drawable.obleka_dete;
		}
		if (god >= 10 && god <= 55) {
			result += "Многу сакам да играм ";
			result += od_10_do_55_hobi[r.nextInt(od_10_do_55_hobi.length)];
			result += ". ";
		}
		if (god >= 16 && god <= 36) {
			result += "Во слободно време ";
			result += od_16_do_36_hobi[r.nextInt(od_16_do_36_hobi.length)];
			result += ". ";
		}
		if (god >= 21 && god <= 55) {
			result += "Работам како ";
			int rabota= r.nextInt(od_21_do_55_rabota.length);
			result += od_21_do_55_rabota[rabota];
			result += ". ";
			clothes= rabotaMapa[rabota];
		}
		if (god >= 10 && god <= 55) {
			result += "На крајот од мојот ден обожавам да ";
			result += od_21_do_55_hobi[r.nextInt(od_21_do_55_hobi.length)];
			result += ". ";

		}
		
		if (god>55){
			result += "Мојата единствена преокупација е да  ";
			result += nad_55[r.nextInt(nad_55.length)];
			result += ". ";
			if (pol==0){
				hair = R.drawable.kosa_maska_penz;
				clothes= R.drawable.obleka_penz;
			}else{
				hair = R.drawable.kosa_zenska_penz;
				clothes= R.drawable.obleka_penz_zenska;
			}
			
			
		}
		
		return result;
	}
}