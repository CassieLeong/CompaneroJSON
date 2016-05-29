package com.example.cassieleong.companerojson;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = (TextView) findViewById(R.id.textView1);
        String strJson = "" +
                "{" +
                "\"Carrot\":" +

                "[{\"name\" : \"Arkansas #19\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Montana y Nebrazka, Col. Nápoles\n" +
                "Horas de Ocupación: 179.1\n" +
                "Latitud: 19.392175\n" +
                "Longitud: -99.173659\", \"coordinates\" : \"-99.173659,19.392175,0.0\"},{\"name\" : \"Av. Colonia del Valle #101\", \"description\" : \"Modelo: Xtrail\n" +
                "Entre calles: Sacramento e Insurgentes Sur, Col. Del Valle\n" +
                "Horas de Ocupación: 133.2\n" +
                "Latitud: 19.38603\n" +
                "Longitud: -99.174609\", \"coordinates\" : \"-99.174609,19.38603,0.0\"},{\"name\" : \"Bajo Puente Juan Escutia\", \"description\" : \"Modelo: Xtrail / Leaf\n" +
                "Entre calles: Juan Escutia y Juan de la Barrera\n" +
                "Horas de Ocupación: 80.0 / 74.8\n" +
                "Latitud: 19.417246\n" +
                "Longitud: -99.179057\", \"coordinates\" : \"-99.179057,19.417246,0.0\"},{\"name\" : \"Bajo Puente Universidad\", \"description\" : \"Modelo: March / Leaf\n" +
                "Entre calles: Cto Interior y Av. Universidad\n" +
                "Horas de Ocupación: 68.6 / 60.3\n" +
                "Latitud: 19.360371\n" +
                "Longitud: -99.173166\", \"coordinates\" : \"-99.173166,19.360371,0.0\"},{\"name\" : \"Chilpancingo #52\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Tlaxcala y Aguascalientes, Col. Condesa.\n" +
                "Horas de Ocupación: 60.2\n" +
                "Latitud: 19.407537\n" +
                "Longitud: -99.169555\", \"coordinates\" : \"-99.169555,19.407537,0.0\"},{\"name\" : \"Coahuila #193\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Medellín y Manzanillo, Col Roma Norte\n" +
                "Horas de Ocupación: 59.6\n" +
                "Latitud: 19.410937\n" +
                "Longitud: -99.165092\", \"coordinates\" : \"-99.165092,19.410937,0.0\"},{\"name\" : \"Dakota #95\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Estacionamiento del Hotel Crowne Plaza\n" +
                "Horas de Ocupación: 59.3\n" +
                "Latitud: 19.395976\n" +
                "Longitud: -99.174309\", \"coordinates\" : \"-99.174309,19.395976,0.0\"},{\"name\" : \"Dante #13\", \"description\" : \"Modelo: Xtrail\n" +
                "Entre calles: Victor Hugo y Tolstoi, Col. Anzures\n" +
                "Horas de Ocupación: 58.0\n" +
                "Latitud: 19.426498\n" +
                "Longitud: -99.178164\", \"coordinates\" : \"-99.178164,19.426498,0.0\"},{\"name\" : \"Ejército Nacional 904\", \"description\" : \"Modelo: Xtrail / March\n" +
                "Entre calles: Sófocles y Sócrates.\n" +
                "Horas de Ocupación: 56.4 /55.4\n" +
                "Latitud: 19.438367\n" +
                "Longitud: -99.204361\", \"coordinates\" : \"-99.204361,19.438367,0.0\"},{\"name\" : \"Federico T de la Chica #18\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Circuito Centro Comercial, Cd. Satélite\n" +
                "Horas de Ocupación: 53.7\n" +
                "Latitud: 19.513296\n" +
                "Longitud: -99.230909\", \"coordinates\" : \"-99.230909,19.513296,0.0\"},{\"name\" : \"Gabriel Mancera #1536\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Parroquia y Felix Cuevas\n" +
                "Horas de Ocupación: 52.8\n" +
                "Latitud: 19.369917\n" +
                "Longitud: -99.168287\", \"coordinates\" : \"-99.168287,19.369917,0.0\"},{\"name\" : \"General Primm #82\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Millan y Lisboa, Col. Juárez\n" +
                "Horas de Ocupación: 52.5\n" +
                "Latitud: 19.430741\n" +
                "Longitud: -99.155839\", \"coordinates\" : \"-99.155839,19.430741,0.0\"},{\"name\" : \"Gobernador Agustin Vicente Eguía #9\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Av. Revolucion y Gral Juan Cano.\n" +
                "Horas de Ocupación: 49.3\n" +
                "Latitud: 19.407757\n" +
                "Longitud: -99.184936\", \"coordinates\" : \"-99.184936,19.407757,0.0\"},{\"name\" : \"González Camarena 999\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Estacionamineto de Plaza Pasaje Santa Fe\n" +
                "Horas de Ocupación: 49.0\n" +
                "Latitud: 19.367000\n" +
                "Longitud: -99.262000\", \"coordinates\" : \"-99.262,19.367,0.0\"},{\"name\" : \"Horacio # 312\", \"description\" : \"Modelo: March / Prius\n" +
                "Entre calles: Entre Schiller y Petrarca\n" +
                "Horas de Ocupación: 47.6 /47.5\n" +
                "Latitud: 19.433119\n" +
                "Longitud: -99.186188\", \"coordinates\" : \"-99.186188,19.433119,0.0\"},{\"name\" : \"Insurgentes Norte #130\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Col. Sta María La Ribera entre Sor Juana Inés de la Cruz y Amado Nervo.\n" +
                "Horas de Ocupación: 47.2\n" +
                "Latitud: 19.444258\n" +
                "Longitud: -99.154163\", \"coordinates\" : \"-99.154163,19.444258,0.0\"},{\"name\" : \"Liverpool #179\", \"description\" : \"Modelo: March / Leaf\n" +
                "Entre calles: Av. Chapultepec y florencia\n" +
                "Horas de Ocupación: 46.7 / 44.3\n" +
                "Latitud: 19.423373\n" +
                "Longitud: -99.166305\", \"coordinates\" : \"-99.166305,19.423373,0.0\"},{\"name\" : \"Londres #91\", \"description\" : \"Modelo: March / Prius\n" +
                "Entre calles: Amberes y Niza, Col Juárez.\n" +
                "Horas de Ocupación: 43.3 / 42.4 \n" +
                "Latitud: 19.426109\n" +
                "Longitud: -99.162753\", \"coordinates\" : \"-99.162753,19.426109,0.0\"},{\"name\" : \"Manuel M Contreras 61\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Francisco Pimentel y Guillermo Prieto\n" +
                "Horas de Ocupación: 40.5\n" +
                "Latitud: 19.438666\n" +
                "Longitud: -99.16494\", \"coordinates\" : \"-99.16494,19.438666,0.0\"},{\"name\" : \"Matanzas #668\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Montevideo y Buenavista, Col. Lindavista\n" +
                "Horas de Ocupación: 40.2\n" +
                "Latitud: 19.490964\n" +
                "Longitud: -99.132257\", \"coordinates\" : \"-99.132257,19.490964,0.0\"},{\"name\" : \"Mérida #68 Col. Roma\", \"description\" : \"Modelo: Xtrail\n" +
                "Entre calles: Colima y Durango, Col. Roma\n" +
                "Horas de Ocupación: 39.5\n" +
                "Latitud: 19.421182\n" +
                "Longitud: -99.157781\", \"coordinates\" : \"-99.157781,19.421182,0.0\"},{\"name\" : \"Mérida #71\", \"description\" : \"Modelo: March / March\n" +
                "Entre calles: Colima y Durango, Col. Roma\n" +
                "Horas de Ocupación: 39.0 / 38.8\n" +
                "Latitud: 19.421147\n" +
                "Longitud: -99.158028\", \"coordinates\" : \"-99.158028,19.421147,0.0\"},{\"name\" : \"Moctezuma #115, Del Carmen\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Caballo Calco y Abasolo, Col. Del Carmen Coyoacan\n" +
                "Horas de Ocupación: 38.5\n" +
                "Latitud: 19.350647\n" +
                "Longitud: -99.16084\", \"coordinates\" : \"-99.16084,19.350647,0.0\"},{\"name\" : \"Moliere #307\", \"description\" : \"Modelo: Xtrail / Prius / March\n" +
                "Entre calles: Homero y Ejercito Nacional, Col. Polanco\n" +
                "Horas de Ocupación: 36.8 / 33.4 / 33.4\n" +
                "Latitud: 19.436769\n" +
                "Longitud: -99.201114\", \"coordinates\" : \"-99.201114,19.436769,0.0\"},{\"name\" : \"Parque Carrot\", \"description\" : \"Modelo: Xtrail / Prius / March\n" +
                "Entre calles: Michoacán esq. Vicente Suárez\n" +
                "Horas de Ocupación: 32.9 / 31.0 / 28.0 \n" +
                "Latitud: 19.411547\n" +
                "Longitud: -99.175304\", \"coordinates\" : \"-99.175304,19.411547,0.0\"},{\"name\" : \"Paseo de la Reforma 157.\", \"description\" : \"Modelo: Xtrail\n" +
                "Entre calles: Esqina Insurgentes\n" +
                "Horas de Ocupación: 26.1\n" +
                "Latitud: 19.431202\n" +
                "Longitud: -99.159799\", \"coordinates\" : \"-99.159799,19.431202,0.0\"},{\"name\" : \"Plaza Las Aguilas\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Condor y las Aguilas.\n" +
                "Horas de Ocupación: 23.9\n" +
                "Latitud: 19.361144\n" +
                "Longitud: -99.197136\", \"coordinates\" : \"-99.197136,19.361144,0.0\"},{\"name\" : \"Puente de la Morena 95\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Esquina Patriotismo\n" +
                "Horas de Ocupación: 21.1\n" +
                "Latitud: 19.396137\n" +
                "Longitud: -99.181473\", \"coordinates\" : \"-99.181473,19.396137,0.0\"},{\"name\" : \"Río de la Plata #20\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Río Lerma y Río Panuco\n" +
                "Horas de Ocupación: 19.3\n" +
                "Latitud: 19.42744\n" +
                "Longitud: -99.174296\", \"coordinates\" : \"-99.174296,19.42744,0.0\"},{\"name\" : \"Río Tiber #93\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Río Lerma y Río Panuco\n" +
                "Horas de Ocupación: 19.0\n" +
                "Latitud: 19.429157\n" +
                "Longitud: -99.168865\", \"coordinates\" : \"-99.168865,19.429157,0.0\"},{\"name\" : \"Xola #321\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Cda de Xola y Av. Coyoacan\n" +
                "Horas de Ocupación: 18.2\n" +
                "Latitud: 19.397688\n" +
                "Longitud: -99.167813\", \"coordinates\" : \"-99.167813,19.397688,0.0\"},{\"name\" : \"Zamora #11\", \"description\" : \"Modelo: March\n" +
                "Entre calles: Veracruz y Agustín Melgar\n" +
                "Horas de Ocupación: 15.9\n" +
                "Latitud: 19.419174\n" +
                "Longitud: -99.17647\", \"coordinates\" : \"-99.17647,19.419174,0.0\"}]}";

        String data = "";

        try {
            JSONObject jsonRootObject = new JSONObject(strJson);
            // Get the instance of JSONArray that contains JSONObjects
            JSONArray jsonArray = jsonRootObject.optJSONArray("Carrot");

            //Interate the jsonArray and print the infor of JsonObjects

            for (int i=0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String coordinates = jsonObject.optString("coordinates").toString();
                String name = jsonObject.optString("name").toString();

                data += "Node"+i+" : \n coordinates= "+ coordinates +" \n Name= "+ name + "\n ";

            }

            output.setText(data);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
