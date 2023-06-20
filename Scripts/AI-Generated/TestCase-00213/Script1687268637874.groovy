import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_alerts-are-displayed-but-disappear-before-i-can-accept-29'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/alerts-are-displayed-but-disappear-before-i-can-accept-it/60318/29')

'step 2: Add visual checkpoint at Page_t_alerts-are-displayed-but-disappear-before-i-can-accept-29'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00213_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
