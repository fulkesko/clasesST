using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using examen1;

namespace examen1.Controllers
{
    public class loginsController : Controller
    {
        private bd_MatasanosEntities db = new bd_MatasanosEntities();

        // GET: logins
        public ActionResult Index()
        {
            var login = db.login.Include(l => l.stakeholder);
            return View(login.ToList());
        }

        // GET: logins/Details/5
        public ActionResult Details(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            login login = db.login.Find(id);
            if (login == null)
            {
                return HttpNotFound();
            }
            return View(login);
        }

        // GET: logins/Create
        public ActionResult Create()
        {
            ViewBag.rut_stakeholder = new SelectList(db.stakeholder, "rut_stakeholder", "nombres_stakeholder");
            return View();
        }

        // POST: logins/Create
        // Para protegerse de ataques de publicación excesiva, habilite las propiedades específicas a las que desea enlazarse. Para obtener 
        // más información vea https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "rut_stakeholder,password")] login login)
        {
            if (ModelState.IsValid)
            {
                db.login.Add(login);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.rut_stakeholder = new SelectList(db.stakeholder, "rut_stakeholder", "nombres_stakeholder", login.rut_stakeholder);
            return View(login);
        }

        // GET: logins/Edit/5
        public ActionResult Edit(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            login login = db.login.Find(id);
            if (login == null)
            {
                return HttpNotFound();
            }
            ViewBag.rut_stakeholder = new SelectList(db.stakeholder, "rut_stakeholder", "nombres_stakeholder", login.rut_stakeholder);
            return View(login);
        }

        // POST: logins/Edit/5
        // Para protegerse de ataques de publicación excesiva, habilite las propiedades específicas a las que desea enlazarse. Para obtener 
        // más información vea https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "rut_stakeholder,password")] login login)
        {
            if (ModelState.IsValid)
            {
                db.Entry(login).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.rut_stakeholder = new SelectList(db.stakeholder, "rut_stakeholder", "nombres_stakeholder", login.rut_stakeholder);
            return View(login);
        }

        // GET: logins/Delete/5
        public ActionResult Delete(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            login login = db.login.Find(id);
            if (login == null)
            {
                return HttpNotFound();
            }
            return View(login);
        }

        // POST: logins/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(string id)
        {
            login login = db.login.Find(id);
            db.login.Remove(login);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
