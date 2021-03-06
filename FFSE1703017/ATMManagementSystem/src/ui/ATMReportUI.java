package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import model.ATMReport;
import model.ATMReportDB;
import model.AddressDB;
import model.ComboItem;

public class ATMReportUI extends JPanel {

	private static final long serialVersionUID = 1L;
	private DefaultTableModel mdlATMList;
	private JButton btnFilterByCode, btnFilterByAddress;
	private JTextField txtSearch;
	private PlaceholderTextField txtStreet;
	private JComboBox<ComboItem> cbSelect, cbDistrict, cbWard;
	private CardLayout card;
	private JPanel pnSelection;
	
	private ActionListener evtFilterSelect = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int i = cbSelect.getSelectedIndex();
			if (i == 1) {
				card.show(pnSelection, "2");
			} else {
				card.show(pnSelection, "1");
			}
		}
	};

	private ActionListener evtFilterByCode = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			String code = txtSearch.getText().trim();
			ArrayList<ATMReport> arr = ATMReportDB.getATMsByCode(code);
			mdlATMList.setRowCount(0);
			for (ATMReport atm : arr) {
				String[] row = { atm.getCode(), atm.getDistrict(), atm.getWard(), atm.getStreet(),
						String.format("%,d", (long) atm.getAmount()) };
				mdlATMList.addRow(row);
			}
		}
	};

	private ActionListener evtFilterByAddress = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			ComboItem itemD = (ComboItem) cbDistrict.getSelectedItem();
			int districtID = itemD.getKey();
			ComboItem itemW = (ComboItem) cbWard.getSelectedItem();
			int wardID = itemW.getKey();
			String street = txtStreet.getText();
			ArrayList<ATMReport> arr = ATMReportDB.getATMsByAddress(districtID, wardID, street);
			mdlATMList.setRowCount(0);
			for (ATMReport atm : arr) {
				String[] row = { atm.getCode(), atm.getDistrict(), atm.getWard(), atm.getStreet(),
						String.format("%,d", (long) atm.getAmount()) };
				mdlATMList.addRow(row);
			}

		}
	};

	public ATMReportUI() {
		addPanel();
		addEvent();
	}

	private void addPanel() {
		/* Panel chính */
		this.setLayout(new BorderLayout());
		JPanel pnTitle = new JPanel();
		JPanel pnAction = new JPanel();
		this.add(pnTitle, BorderLayout.NORTH);
		this.add(pnAction, BorderLayout.CENTER);

		/* Panel chính -> Tiêu đề */
		pnTitle.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
		String title = "<html><p style='font-size:12px'>BÁO CÁO MÁY ATM</p></html>";
		JLabel lblTitle = new JLabel(title);
		pnTitle.add(lblTitle);

		/* Panel chính -> Action */
		pnAction.setLayout(new BoxLayout(pnAction, BoxLayout.Y_AXIS));
		JPanel pnFilter = new JPanel();
		JScrollPane spATMList = new JScrollPane();
		pnAction.add(Box.createRigidArea(new Dimension(0, 10)));
		pnAction.add(pnFilter);
		pnAction.add(spATMList);
		pnAction.add(Box.createRigidArea(new Dimension(0, 5)));

		/* Panel chính -> Action -> Filter */

		JPanel pnSelect = new JPanel();
		JLabel lblSelect = new JLabel("Theo:");
		cbSelect = new JComboBox<>();
		cbSelect.setPreferredSize(new Dimension(65, 20));
		cbSelect.addItem(new ComboItem(0, "Vị trí"));
		cbSelect.addItem(new ComboItem(1, "Mã máy"));
		cbSelect.setSelectedIndex(0);
		pnSelect.add(lblSelect);
		pnSelect.add(cbSelect);

		pnSelection = new JPanel();
		pnFilter.setLayout(new FlowLayout(FlowLayout.LEADING));
		pnFilter.add(pnSelect);
		pnFilter.add(pnSelection);

		/* Panel chính -> Action -> Filter -> Selecion */
		card = new CardLayout();
		pnSelection.setLayout(card);
		JPanel pnLocation = new JPanel();
		JPanel pnSearch = new JPanel();
		pnSelection.add(pnLocation, "1");
		pnSelection.add(pnSearch, "2");

		/* Panel chính -> Action -> Filter -> Selecion -> Location */
		JLabel lblDistrict = new JLabel("Chọn vị trí:");
		cbDistrict = new JComboBox<>();
		cbDistrict.setPreferredSize(new Dimension(100, 20));
		AddressDB.setDistricts(cbDistrict);
		cbWard = new JComboBox<>();
		cbWard.setPreferredSize(new Dimension(100, 20));
		ComboItem itemWard = new ComboItem(0, "Chọn phường");
		cbWard.addItem(itemWard);
		txtStreet = new PlaceholderTextField(15);
		txtStreet.setPlaceholder("Nhập đường");
		btnFilterByAddress = new JButton("Xem");
		pnLocation.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		pnLocation.add(lblDistrict);
		pnLocation.add(cbDistrict);
		pnLocation.add(cbWard);
		pnLocation.add(txtStreet);
		pnLocation.add(btnFilterByAddress);

		/* Panel chính -> Action -> Filter -> Selecion -> Search */
		pnSearch.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		JLabel lblSearch = new JLabel("Nhập mã máy:");
		txtSearch = new JTextField(20);
		btnFilterByCode = new JButton("Xem");
		pnSearch.add(lblSearch);
		pnSearch.add(txtSearch);
		pnSearch.add(btnFilterByCode);

		/* Panel chính -> Action -> Phải -> Danh sách khách hàng */
		JTable tblATMList = new JTable();
		String[] col = { "Mã máy ATM", "Quận", "Phường", "Đường", "Số tiền trong máy" };
		mdlATMList = new DefaultTableModel(col, 0);
		tblATMList.setModel(mdlATMList);
		tblATMList.getColumnModel().setColumnMargin(10);
		
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
		tblATMList.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
		
		spATMList.setViewportView(tblATMList);

	}

	private void addEvent() {
		cbSelect.addActionListener(evtFilterSelect);
		cbDistrict.addActionListener(new DistrictSelectEvent(cbDistrict, cbWard));
		btnFilterByAddress.addActionListener(evtFilterByAddress);
		btnFilterByCode.addActionListener(evtFilterByCode);
	}

}
