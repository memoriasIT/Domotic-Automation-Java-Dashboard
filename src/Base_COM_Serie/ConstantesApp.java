package Base_COM_Serie;

import CommTransport.Comm.tCommConnector;

public class ConstantesApp 
{
	//IniFiles Params
		public static final String 			CONFIG_FILE = "Base_COMSerie.conf";
		
		public static final String 			WINDOW_TITLE = "PR�CTICAS ELECTR�NICA PARA DOM�TICA - COMUNICACIONES MODBUS ";
		public static final String 			STATUSBAR_MSGLEFT = "Puerto seleccionado para comunicaci�n ModBus : ";
			
		public static final String			SERIALCONSOLE = "serialConsole";
		
		//Setup
		//TODO: Incluir la selecci�n del conector serie en una forma de configuraci�n 
		public static final tCommConnector	SERIALCONNECTION = tCommConnector.CN_JSSC;  //tCommConnector.CN_RXTX; //
}