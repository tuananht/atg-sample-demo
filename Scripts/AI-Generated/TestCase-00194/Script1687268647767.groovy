import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_groovy-unable-to-resolve-class-when-new-package-and-keyword-created'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/groovy-unable-to-resolve-class-when-new-package-and-keyword-created/24431')

'step 2: Add visual checkpoint at Page_t_groovy-unable-to-resolve-class-when-new-package-and-keyword-created'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00194_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
