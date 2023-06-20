import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-groovy-script-on-katalon-to-click-on-row-of-grid'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-groovy-script-on-katalon-to-click-on-row-of-grid/35818')

'step 2: Add visual checkpoint at Page_t_using-groovy-script-on-katalon-to-click-on-row-of-grid'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00834_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
