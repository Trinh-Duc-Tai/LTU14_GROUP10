# project-IT4883
echo "# project-IT4883" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/Trinh-Duc-Tai/project-IT4883.git
git push -u origin master
----------
git branch testing //create branch
git checkout testing //switch branch
git add .
git commit -m "ghi chú"
git log --oneline --decorate //log branch
git push -u origin testing //up 
--------
git log -p hiển thị sự khác nhau, muốn thoát ấn Q
----------
git log --pretty=oneline    //hiển thị lịch sử commit
git log --pretty=format:"%h -%an, %ar:%s" //a179d16 -Trinh Duc Tai, 2 hours ago:them index.html
--------
git commit -m "chú thích"
git add <file thiếu>
git commit --amend //thì sẽ vẫn giữ nguyên commit trên ko bị chia làm 2 commit
----------------------
git reset HEAD filemMonBoRaKhoiCommit
----------------------------
git checkout -- tenFileMuonBoQuaSuThayDoi //tranh lam
----------------------------
từ máy khác:
git init
git remote add <tên nhánh> <url.git>  //để add vào repo
git fetch <tên nhánh> //để xem
git add .
git commit -m "chú thích"
git push <tên nhánh> master     //vì nhánh hiện tại là master và chúng ta cũng push lên nhánh master
git remote show tên nhánh
git pull <tên nhánh>    //để lấy về


git remote rm <tên nhánh> //xóa nó đi để còn add nhánh khác
git remote      //để check các nhánh remote
----------
nếu đang ở origin muốn đổi tên thì:
git remote rename <tên cũ> <tên mới>

--------
git config --global alias.st status     
//thì lần sau muốn gõ git status chỉ cần gõ git st là được
git config --global alias.last 'log -1 HEAD'     
//tương tự lần sau muốn gõ git log -1 HEAD chỉ cần gõ git last là được

----------