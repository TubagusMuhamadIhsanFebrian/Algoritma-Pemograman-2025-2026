#Variabel global untuk menimpan data Buku
buku = []

#Fungsi untuk menampilkan semua data
def show_data():
    if len(buku) <= 0:
        print('BELUM ADA DATA')
    else:
        for indeks in range(len(buku)):
            print('[%d] %s' % (indeks, buku[indeks]))

#Fungsi untuk menambah data
def insert_data():
    buku_baru = raw_input('Judul Buku: ')
    buku.append(buku_baru)

#Fungsi untuk edit data
def edit_data():
    show_data()
    indeks = input('Inputan ID buku: ')
    if(indeks > len(buku)):
        print('ID salah')
    else:
        judul_baru = raw_input('Judul Baru: ')
        buku[indeks] = judul_baru

#Fungsi untuk menghapus data
def delete_data():
    show_data()
    indeks = input('Inputan ID buku: ')
    if(indeks > len(buku)):
        print('ID salah')
    else:
        buku.remove(buku[indeks])

#Fungsi untuk menamnpilkan menu
def show_menu():
    print('\n')
    print('---------- MENU ----------')
    print('[1] Show Data')
    print('[2] Insert Data')
    print('[3] Edit Data')
    print('[4] Delete Data')
    print('[5] Exit')

    menu = input('PILIH MENU> ')
    print('\n')

    if menu == 1:
        show_data()
    elif menu == 2:
        insert_data()
    elif menu == 3:
        edit_data()
    elif menu == 4:
        delete_data()
    elif menu == 5:
        exit()
    else:
        print('Salah Pilih!')

if __name__ == '__main__':
    
    while(True):
        show_menu()