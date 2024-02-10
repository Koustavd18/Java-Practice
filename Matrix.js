const arr1 = [[1,2], [3,4], [4,5]];

const arr2 = [[1,2], [3,4], [4,5]];

let arr3 =[]


// let resmat = arr1.map((r, i) =>
//     r.map((v, j) => v + arr2[i][j])
// );
// for (let i = 0; i < resmat.length; i++) {
//     console.log(resmat[i]);
// }

for (let i= 0 ; i<3; i++){
    let p = []
    for (let j =0 ; j< 2; j++){
        let r;

        r= arr1[i][j] + arr2[i][j];
        p.push(r);
    }
    arr3.push(p)
}

console.log(arr3)