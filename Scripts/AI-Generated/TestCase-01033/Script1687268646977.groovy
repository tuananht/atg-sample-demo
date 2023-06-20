import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webui-sendkeys-should-accept-an-org-openqa-selenium-keys-argument'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webui-sendkeys-should-accept-an-org-openqa-selenium-keys-argument/27991')

'step 2: Add visual checkpoint at Page_t_webui-sendkeys-should-accept-an-org-openqa-selenium-keys-argument'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01033_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
