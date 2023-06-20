import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_api-doc-of-com-kms-katalon-core-testdata-testdatafactory-is-incomplete'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/api-doc-of-com-kms-katalon-core-testdata-testdatafactory-is-incomplete/46236')

'step 2: Add visual checkpoint at Page_t_api-doc-of-com-kms-katalon-core-testdata-testdatafactory-is-incomplete'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00686_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
