import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-div-katalon-elementinfodiv-covers-up-buttons-in-ui'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-div-katalon-elementinfodiv-covers-up-buttons-in-ui/12736')

'step 2: Add visual checkpoint at Page_t_the-div-katalon-elementinfodiv-covers-up-buttons-in-ui'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00114_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
