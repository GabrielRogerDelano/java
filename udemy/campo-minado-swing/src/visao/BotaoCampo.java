package visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import modelo.Campo;
import modelo.CampoEvento;
import modelo.CampoObservador;

public class BotaoCampo extends JButton implements CampoObservador, MouseListener{

	private final Color BG_PADRAO = new Color(184,184,184);
	private final Color BG_MARCAR = new Color(8, 180 , 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	
	private Campo campo;
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBorder(BorderFactory.createBevelBorder(0));
		setBackground(BG_PADRAO );
		
		addMouseListener(this);
		campo.registrarObservador(this);
	}
	
	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch (evento) {
			case ABRIR: {
				aplicarEstiloAbrir();
				break;
			}
			case MARCAR: {
				aplicarEstiloMarcar();
				break;
			}
			case EXPLODIR: {
				aplicarEstiloExplodir();
				break;
			}
			default:
				aplicarEstiloPadrao();
		}
	}
	private void aplicarEstiloPadrao() {
		// TODO Auto-generated method stub
		
	}
	
	private void aplicarEstiloExplodir() {
		// TODO Auto-generated method stub
		
	}
	
	private void aplicarEstiloMarcar() {
		// TODO Auto-generated method stub
		
	}
	
	private void aplicarEstiloAbrir() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		switch (campo.minasNaVizinhanca() ) {
		case 1: 
			setForeground(TEXTO_VERDE);
			break;

		case 2:
			setForeground(Color.BLUE);
			break;
			
		case 3:
			setForeground(Color.yellow);
			break;
		
		case 4:
			setForeground(Color.orange);
			break;
			
		
		case 5:
		case 6:
		case 7:
		
			setForeground(Color.RED);
			break;
		
		default:
			setForeground(Color.PINK);
		}
		
		String valor = !campo.vizinhancaSegura() ? campo.minasNaVizinhanca() +"": "";
		setText(valor);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			campo.abrir();
		}else {
			campo.alterarMarcacao();
		}
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
}
