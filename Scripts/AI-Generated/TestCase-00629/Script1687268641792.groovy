import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_no-signature-of-method-static-com-kms-katalon-core-configuration-runconfiguration-getoverridingglobalvariable'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/no-signature-of-method-static-com-kms-katalon-core-configuration-runconfiguration-getoverridingglobalvariable/17000')

'step 2: Add visual checkpoint at Page_t_no-signature-of-method-static-com-kms-katalon-core-configuration-runconfiguration-getoverridingglobalvariable'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00629_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
