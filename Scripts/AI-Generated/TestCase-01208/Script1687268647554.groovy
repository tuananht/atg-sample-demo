import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_autoit-scripts-written-in-katalon-are-not-working-when-in-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/autoit-scripts-written-in-katalon-are-not-working-when-in-jenkins/19541/2')

'step 2: Add visual checkpoint at Page_t_autoit-scripts-written-in-katalon-are-not-working-when-in-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01208_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
